import java.util.UUID;

public class MockOAuth2Server implements OAuth2Server{

    //Method implementation to mock generation of new access token
    @Override
    public String generateAccessToken() {
        return UUID.randomUUID().toString();
    }
}
