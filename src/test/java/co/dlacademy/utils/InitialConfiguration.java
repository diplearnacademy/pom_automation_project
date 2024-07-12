package co.dlacademy.utils;

import java.io.InputStream;
import java.util.Properties;

public class InitialConfiguration {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = InitialConfiguration.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return System.getProperty(key, properties.getProperty(key));
    }
}
