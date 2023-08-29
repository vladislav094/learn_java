package jrush;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solution106 {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/vladislav/IdeaProjects/learn_java/src/main/java/jrush/myjson.json";
        List<String> arr = new ArrayList<>();
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject jsonObject = new JSONObject(content);
            System.out.println(jsonObject);
            JSONArray itemsArray = jsonObject.getJSONArray("items");
            for (int i = 0; i < itemsArray.length(); i++) {
                JSONObject item = itemsArray.getJSONObject(i);
                int gameId= item.getInt("gameId");
                arr.add(String.valueOf(gameId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String s: arr) {
            System.out.print(s + ",");
        }
        System.out.println();
        System.out.println(arr.size());

    }
}
