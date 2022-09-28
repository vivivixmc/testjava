package configuration;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class configparser {
    private static final String filePath = "Ose/src/main/java/config.json";


    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        JSONObject config = new JSONObject(content);

        System.out.println(config.getJSONObject("User").getString("login"));
    }

}
