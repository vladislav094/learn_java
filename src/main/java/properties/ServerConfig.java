package properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({"file:./src/main/java/properties/debug.properties"})
public interface ServerConfig extends Config {

    @Key("server.http.port")
    int port();

    @Key("server.host.name")
    String hostName();

    @Key("server.max.threads")
    @DefaultValue("42")
    int maxThreads();


}
