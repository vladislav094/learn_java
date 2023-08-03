package debug;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCountry {
    public static void main(String[] args) {
        String filePath = "src/main/java/debug/country.json";

        List<String> alpha2List = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            JSONObject jsonObject = new JSONObject(jsonContent.toString());

            for (String key : jsonObject.keySet()) {
                JSONObject innerObject = jsonObject.getJSONObject(key);
                String alpha2value = innerObject.optString("Alpha2", "");
                if (!alpha2value.isEmpty() || alpha2value == null) {
                    alpha2List.add(alpha2value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//         Вывод списка значений ключей "Alpha2"
        for (String alpha2 : alpha2List) {
            System.out.println(alpha2);
        }

    }
}
