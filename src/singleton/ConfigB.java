package singleton;

public class ConfigB {
    public void config() {
        Configuration.getConfigurationInstance().setAppConfig("b", "Object b finishes configuration with singleton configuration instance");
    }
}
