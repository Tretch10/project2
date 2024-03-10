class Sender {
    private String message;
    private Receiver receiver;
    private OAuth2Server oauth2Server;

    public Sender(String message, Receiver receiver, OAuth2Server oauth2Server) {
        this.message = message;
        this.receiver = receiver;
        this.oauth2Server = oauth2Server;
    }

    // Send the message to the receiver after verifying authenticity
    public void sendMessage() {
        if (verifyReceiver()) {
            System.out.println("Sender: Authenticating receiver...");
            String accessToken = oauth2Server.generateAccessToken();
            System.out.println("Access token generated: "+ accessToken);
            System.out.println("Sender: Sending message to receiver...");
            receiver.receiveMessage(message, accessToken);
        } else {
            System.out.println("Sender: Receiver authentication failed.");
        }
    }

    // Verify the authenticity of the receiver
    private boolean verifyReceiver() {
        // Simulating some authentication process, can be more sophisticated in real-world scenario
        return receiver.isAuthenticated();
    }
}
