package debug;

import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReadCountry {

    public static final String filePath = "src/main/java/debug/country.json";
    public static final String outputFilePath = "src/main/java/debug/result.json";
    public static final String fileWithGetRequestResults = "src/main/java/debug/arrayResults.json";
    public static final String fileOfPostRequest = "src/main/java/debug/postRequestURI.json";


//    public static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {

        Set<String> alpha2List = new HashSet<>();

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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String key: alpha2List) {
                writer.write(key);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//         Вывод списка значений ключей "Alpha2"
//        for (String alpha2 : alpha2List) {
//            System.out.println(alpha2);
//        }
    }

    public static void writeInFile(String answer, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            try {
                writer.write(answer);
                writer.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<String> readFile(String filePath) {
        BufferedReader reader;
        ArrayList<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            result.add(line.toLowerCase());
            }
        return result;
    }

    public static String readEnv() {
        BufferedReader reader;
        String result = "";
        try {
//            reader = new BufferedReader(new FileReader("/home/useradmin/Idea/learn_java/.env"));
            reader = new BufferedReader(new FileReader("/home/vladislav/IdeaProjects/learn_java/.env"));
            while ((result = reader.readLine()) != null) break;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void clearFileIfFull(String filePath) {
        File file = new File(filePath);
        if (file.length() != 0) {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
