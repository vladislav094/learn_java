package imageSave;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class SaveImage {
    public static void main(String[] args) throws IOException {

        String host = "";
        String imgFormat = ".png";

        URL url = new URL("");
        Scanner scanner = new Scanner(url.openStream());
        String content = scanner.useDelimiter("\\Z").next();
        scanner.close();

        try {
            JSONObject jsonObject = new JSONObject(content);
            JSONObject data = jsonObject.getJSONObject("data");
            JSONArray teams = data.getJSONArray("teams");

            for (int i = 0; i < teams.length(); i++) {
                JSONObject object = teams.getJSONObject(i);
                String imgLiq = object.getString("image");
                String imageS3 = host + object.getString("imageS3");
                URL imgLiqURL = new URL(imgLiq);
                URL imgS3URL = new URL(imageS3);
                InputStream inputStream1 = imgLiqURL.openStream();
                InputStream inputStream2 = imgS3URL.openStream();

                Path outputImgLiq = Path.of("/home/useradmin/Idea/learn_java/src/main/java/imageSave/img" + i + imgFormat);
                Path outputImgS3 = Path.of("/home/useradmin/Idea/learn_java/src/main/java/imageSave/img" + i+ "_" + imgFormat);
                Files.copy(inputStream1, outputImgLiq, StandardCopyOption.REPLACE_EXISTING);
                Files.copy(inputStream2, outputImgS3, StandardCopyOption.REPLACE_EXISTING);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
