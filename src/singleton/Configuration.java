package singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static final Map<String, String> appConfig = new HashMap<>();

    private static volatile Configuration configInstance;

    private Configuration() {
        if (configInstance != null) {
            throw new IllegalStateException("Singleton instance already created.");
        }
    }

    public static Configuration getConfigurationInstance() {
        // double-checking lock
        if (configInstance == null) {
            synchronized (Configuration.class) {
                if (configInstance == null) {
                    configInstance = new Configuration();
                }
            }
        }
        return configInstance;
    }

    public String getAppConfig(String key) {
        return appConfig.get(key);
    }

    public void setAppConfig(String key, String value) {
        appConfig.put(key, value);
    }
}