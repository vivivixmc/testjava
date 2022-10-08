package configuration;

import org.json.*;
import resources.CCluster;

import javax.json.stream.JsonParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class jsonparser {
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

    public ArrayList<CCluster> getClusters(config conf) {
        CCluster ref;
        JSONArray clustersArray = config.getJSONArray("Clusters");
        for(int i=0; i < clustersArray.length(); i++){
            JSONObject buf;
            buf = (JSONObject) clustersArray.get(i);
            ref = new CCluster();
            ref.NewCluster(buf.getString("Name"),buf.getString("Url"),buf.getString("Api"));
            conf.addCluster(ref);
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        jsonparser jp = new jsonparser();
        System.out.println();
    }

}
