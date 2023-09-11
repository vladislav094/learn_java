package jsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Parser2 {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/vladislav/IdeaProjects/learn_java/src/main/java/jsonParser/geo.json";
        String filePath2 = "/home/vladislav/IdeaProjects/learn_java/src/main/java/jsonParser/debug.json";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        String content2 = new String(Files.readAllBytes(Paths.get(filePath2)));
        JSONObject object = new JSONObject(content);
        JSONArray object2 = new JSONArray(content2);

        TreeSet<String> arr = new TreeSet<>();
        TreeSet<String> arr2 = new TreeSet<>();

        for (String key : object.keySet()) {
            JSONObject countryObject = object.getJSONObject(key);
            if (!countryObject.isNull("Beta")) {
                String alpha2 = countryObject.getString("Beta");
                arr.add(alpha2);
            }
        }

        for (int i = 0; i < object2.length(); i++) {
            JSONObject subObject = object2.getJSONObject(i);
            String code = subObject.getString("code");
            arr2.add(code);
        }

        String[] first = arr.toArray(new String[arr.size()]);
        String[] second = arr2.toArray(new String[arr2.size()]);


        System.out.println(arr.size());
        System.out.println(arr2.size());

        for (int i = 0; i < second.length; i++) {
            arr.add(second[i]);
        }

        System.out.println(arr.size());
        for (String a: arr) {
            System.out.println(a);
        }
    }
}
