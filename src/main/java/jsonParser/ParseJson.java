package jsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParseJson {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/useradmin/Idea/learn_java/src/main/java/jsonParser/myJson.json";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        List<String> arr = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(content);
            JSONObject tournamentBlockGame = jsonObject.getJSONObject("tournamentBlockGame");
            JSONArray items = tournamentBlockGame.getJSONArray("items");
            System.out.println(items);
            for (int i = 0; i < items.length(); i++) {
                JSONObject object = items.getJSONObject(i);
                int gameId = object.getInt("gameId");
                arr.add(String.valueOf(gameId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String filePath2 = "/home/useradmin/Idea/learn_java/src/main/java/jsonParser/tournaments.json";
        String content2 = new String(Files.readAllBytes(Paths.get(filePath2)));

        try {
            JSONObject jsonObject = new JSONObject(content2);
            JSONArray games = jsonObject.getJSONArray("games");
            for (int i = 0; i < games.length(); i++) {
                JSONObject object = games.getJSONObject(i);
                int id = object.getInt("id");
                arr2.add(String.valueOf(id));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(arr);
        Collections.sort(arr2);

        for (String s: arr) {
            System.out.print(s+",");
        }
        System.out.println();
        System.out.println(arr.size());

        System.out.println();
        for (String s: arr2) {
            System.out.print(s+",");
        }
        System.out.println();
        System.out.println(arr2.size());

        System.out.println(arr.containsAll(arr2) && arr2.containsAll(arr));


    }
}
