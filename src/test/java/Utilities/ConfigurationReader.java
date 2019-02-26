package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    static Properties prop;
    static {                //In order to run this configuration.properties first, we use static block
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            prop = new Properties();
            prop.load(file);
            file.close();

        } catch (Exception e) {

        }

    }

    public static String getInfo(String ss){
        return prop.getProperty(ss);
    }
}
