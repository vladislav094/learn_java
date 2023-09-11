package properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import java.io.IOException;
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
    List<Integer> listInt();

}

class MyServerProperties{
    public static void main(String[] args) throws IOException{
        ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
        System.out.println(serverConfig.port());

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("one.properties"));
        String url = System.getProperty("user.name");
        System.out.println(url);
    }

}
