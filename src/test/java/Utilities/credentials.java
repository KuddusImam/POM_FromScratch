package Utilities;

public class credentials {
    final private static String userName = "",
                                password = "",
                                webSite = "http://www.yahoo.com";

    //we use get method because it's final
    public static String getUserName(){
        return userName;
    }

    public static String getPassword(){
        return password;
    }

    public static String getBrowser(){
        return webSite;
    }

}
