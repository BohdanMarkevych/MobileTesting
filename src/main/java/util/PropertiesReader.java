package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PropertiesReader {
    private static final Logger logger = Logger.getLogger((PropertiesReader.class).toString());
    private static final Properties properties = new Properties();

    public PropertiesReader() {
    }

    public static String readProperties(String key) {
        String value = null;
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(input);
            value = properties.getProperty(key);
        } catch (IOException e) {
            logger.info("Properties file isn't found");
        }
        return value;
    }

    public String getAppiumURL() {
        return properties.getProperty("APPIUM_URL");
    }



}
