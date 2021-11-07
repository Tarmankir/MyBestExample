package mobile.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MobileConfig {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src/main/resources/config/mobile.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getMobileSetting(String key) {
        return properties.getProperty(key);
    }
}