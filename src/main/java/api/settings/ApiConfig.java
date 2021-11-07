package api.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiConfig {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src/main/resources/config/api.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getApiSetting(String key) {
        return properties.getProperty(key);
    }
}