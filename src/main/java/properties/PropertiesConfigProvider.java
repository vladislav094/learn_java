package properties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface PropertiesConfigProvider {

    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("one.conf");
    }

}
