package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.setProperty("one", "1");
//        FileOutputStream fileOutputStream = new FileOutputStream("my.properties");
//        properties.store(fileOutputStream, "my first work with property");
        FileInputStream fileInputStream = new FileInputStream("my.properties");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("max"));
    }
}
