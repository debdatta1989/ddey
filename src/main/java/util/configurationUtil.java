package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class configurationUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(configurationUtil.class);
    private static final Map<String, String> configuration = new HashMap<String, String>();
    private static final String PATH_CHROME_DRIVER = "path.machine.chrome.driver";
    private static final String URL = "url.path";


    public static String getPathChromeDriver() {
        return configuration.get(PATH_CHROME_DRIVER);
    }

    public static String getTheURl(){return configuration.get(URL);}

    static {
        loadConfigurationMap();
    }

    private configurationUtil() {
    }

    private static void loadConfigurationMap() {
        String testEnv = System.getProperty("test.env", "QA");

        try {
            Properties properties = new Properties();
            InputStream propertyFile = configurationUtil.class.getClassLoader()
                    .getResourceAsStream("config/env_" + testEnv + ".properties");

            properties.load(propertyFile);
            for (String propertyKey : properties.stringPropertyNames()) {
                configuration.put(propertyKey, properties.getProperty(propertyKey));
            }
        } catch (IOException e) {
            LOGGER.error("Exception caught during property initialization.", e);
        }
    }
}



