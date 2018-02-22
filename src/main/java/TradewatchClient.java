import util.HashGen;

public class TradewatchClient {
    private String login;
    private String password;

    public TradewatchClient(String login, String password) {
        this.login = login;
        this.password = HashGen.stringToMD5(password);
    }
}
