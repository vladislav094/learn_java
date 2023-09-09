package properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Arrays;

public interface MyConfig extends Config {
    @DefaultValue("foobar.com:8080")
    @ConverterClass(ServerConverter.class)
    Server server();

    @DefaultValue("google.com, yahoo.com:8080, matteobaccan.github.io/owner:4000")
    @ConverterClass(ServerConverter.class)
    Server[] servers();

    class Server {
        private final String name;
        private final Integer port;

        public Server(String name, Integer port) {
            this.name = name;
            this.port = port;
        }
    }

    class ServerConverter implements Converter<Server> {
        @Override
        public Server convert(Method targetMethod, String text) {
            String[] split = text.split(":", -1);
            String name = split[0];
            Integer port = 80;
            if (split.length >= 2)
                port = Integer.valueOf(split[1]);
            return new Server(name, port);
        }
    }

    class MyClass {
        public static void main(String[] args) {
            MyConfig cfg = ConfigFactory.create(MyConfig.class);
            Server s = cfg.server(); // will return a single server
            Server[] ss = cfg.servers(); // it works also with collections
            System.out.println(ss);
            System.out.println(s);
            System.out.println(s.port);
        }
    }

}

