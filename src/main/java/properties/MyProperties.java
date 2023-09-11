package properties;

import org.aeonbits.owner.ConfigFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("one", "1");
        FileOutputStream fileOutputStream = new FileOutputStream("my.properties");
        properties.store(fileOutputStream, "my first work with property");
        FileInputStream fileInputStream = new FileInputStream("my.properties");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("max"));
//        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
//        System.out.println("Server " + cfg.hostName() + ":" + cfg.port() + " will run " + cfg.maxThreads());

//        Properties properties = new Properties();

//        properties.setProperty("foo", "pineapple");
//        properties.setProperty("bar", "orange");
//        properties.setProperty("baz", "lime");
//        properties.setProperty("pos", "cherry");
//
//        ImportConfig importConfig = ConfigFactory.create(ImportConfig.class, properties);
//        System.out.println(importConfig.bar("qwe"));
//        System.out.println(properties.getProperty("pos"));
//        System.out.println(importConfig.baz());
//        Assert.assertEquals(importConfig.bar(""), "pineapple");



    }

}
