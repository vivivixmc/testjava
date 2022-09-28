package configuration;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class configparser {
    private static final String filePath = "Ose/src/main/java/config.json";
    private static final String content;

    static {
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final JSONObject config = new JSONObject(content);
    public String getLogin() {
        return config.getJSONObject("User").getString("login");
    }
    public String getPasswd() {
        return config.getJSONObject("User").getString("passwd");
    }

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        JSONObject config = new JSONObject(content);

        System.out.println(config.getJSONObject("User").getString("login"));
    }

}
