class Receiver {
    // Receive and process the message
    public void receiveMessage(String message, String accessToken) {
        System.out.println("Receiver: Message received: " + message);
        if (verifyAccessToken(accessToken)) {
            System.out.println("Receiver: Authentication successful.");
            // Process the message here
        } else {
            System.out.println("Receiver: Authentication failed. Message rejected.");
        }
    }

    // Verify the access token received from the sender
    private boolean verifyAccessToken(String accessToken) {
        // assuming access token is valid and not null
        return accessToken != null;
    }

    // Dummy method for simulating receiver authentication
    public boolean isAuthenticated() {
        // Simulated authentication process
        return true;
    }
}
