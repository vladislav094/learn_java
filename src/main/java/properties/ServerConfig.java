package properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import java.util.List;

@Config.Sources({"file:./src/main/java/properties/debug.properties"})
public interface ServerConfig extends Config {

    @Key("server.http.port")
    int port();

    @Key("server.host.name")
    String hostName();

    @Key("server.max.threads")
    @DefaultValue("42")
    int maxThreads();

    @Key("list.integer")
    @DefaultValue("[0, 0, 0]")
    List<Integer> listInt();

}

class MyServerProperties{
    public static void main(String[] args) {
        ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
        System.out.println(serverConfig.listInt());
    }
}
