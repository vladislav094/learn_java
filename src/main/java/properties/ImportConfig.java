package properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Properties;

public interface ImportConfig extends Config {

    @DefaultValue("apple")
    String foo();

//    @DisableFeature(DisableableFeature.PARAMETER_FORMATTING)
    @DefaultValue("banana %s")
    String bar(String name);

    @DefaultValue("pear")
    String baz();

    @DefaultValue("1, 2, 3, 4")
    List<Integer> ints();
}

class MyPersonalDebug{
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("foo", "pineapple");
//        properties.setProperty("bar", "orange");
        properties.setProperty("baz", "lime");

        ImportConfig importConfig = ConfigFactory.create(ImportConfig.class, properties);
        System.out.println(importConfig.bar("Lua"));
        System.out.println(importConfig.ints());

    }
}