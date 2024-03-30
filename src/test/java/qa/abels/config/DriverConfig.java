package qa.abels.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/driver.properties"
})

public interface DriverConfig extends Config {
    @DefaultValue("chrome")
    String browser();

    @DefaultValue("123.0")
    String browserVersion();

    @DefaultValue("1280x720")
    String browserSize();

    String browserRemoteUrl();

    @DefaultValue("eager")
    String pageLoadStrategy();
}