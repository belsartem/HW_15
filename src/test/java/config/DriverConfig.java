package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:config/driver.properties"})
public interface DriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String browser();

    @DefaultValue("100.0")
    String browserVersion();

    @DefaultValue("1280x720")
    String browserSize();

    @DefaultValue("")
    String browserRemoteUrl();
}