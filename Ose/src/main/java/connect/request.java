package connect;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class request {

    public static void request() throws IOException, ParseException {
        String url = "https://reqres.in/api/users?page=2";
        HttpGet httpget = new HttpGet(url);
        httpget.setHeader("Accept", "application/json");
        httpget.setHeader("Authorization", "Bearer sha256d");
        HttpClient httpClient = HttpClients.createDefault();
        HttpResponse response = httpClient.execute(httpget);

        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200){
            System.out.println("Responce Code: " + statusCode);
            String responseBody = EntityUtils.toString((HttpEntity) response.getEntity(), StandardCharsets.UTF_8);
            System.out.println("Response body: " + responseBody);
        } else System.out.println("Error");
    }

    public static void main(String[] args) throws IOException, ParseException {
        request();
    }

}
