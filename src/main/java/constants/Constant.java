package constants;

public class Constant {
    private static final String tradewatchURL = "http://tradewatch.pl/api/";
    private static final String tradewatchSpaceCode = "%20";

    public static String getTradewatchURL() {
        return tradewatchURL;
    }

    public static String getTradewatchSpaceCode() {
        return tradewatchSpaceCode;
    }
}
