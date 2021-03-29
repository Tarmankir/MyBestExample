package ui.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Config {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src/main/resources/config.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getSetting(String key) {
        return properties.getProperty(key);
    }
}