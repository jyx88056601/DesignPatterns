package singleton;

public class ConfigA {
   public void config() {
       Configuration.getConfigurationInstance().setAppConfig("a", "Object a finishes configuration with singleton configuration instance");
   }
}
