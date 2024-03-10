public class OAuth2ZeroKnowledgeProof {



    public static void main(String[] args) {
        // Create a sender and a receiver
        Receiver receiver = new Receiver();
        OAuth2Server oauth2Server = new MockOAuth2Server();
        Sender sender = new Sender("Secret message", receiver, oauth2Server);

        // Sender sends the message
        sender.sendMessage();
    }
}