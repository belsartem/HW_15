package qa.abels.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${env}.properties")
public interface TestDataConfig extends Config {
    @DefaultValue("pl")
    String locale();
    @DefaultValue("default@stage.local")
    String email();
    @DefaultValue("This test is being executed with default test data")
    String address();
}