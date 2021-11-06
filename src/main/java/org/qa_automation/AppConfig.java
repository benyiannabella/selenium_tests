package org.qa_automation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static Properties properties = new Properties();

    static {
        String environment = System.getProperty("env", "production");
        InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(environment + ".properties");

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load properties from configuration file!");
        }
    }

    private static String chromeDriverPath = properties.getProperty("chrome.driver.path");
    private static String geckoDriverPath = properties.getProperty("gecko.driver.path");
    private static String IEDriverPath = properties.getProperty("ie.driver.path");
    private static String applicationPath = properties.getProperty("application.path");

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static String getGeckoDriverPath() {
        return geckoDriverPath;
    }
    public static String getIEDriverPath() {
        return geckoDriverPath;
    }

    public static String getApplicationPath() {
        return applicationPath;
    }
}
