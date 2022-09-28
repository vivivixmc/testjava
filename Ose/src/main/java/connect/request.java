package connect;


import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class request {
    public void request() throws IOException, ParseException {
        String url = "https://reqres.in/api/users?page=2";
        HttpGet httpget = new HttpGet(url);
        httpget.setHeader("Accept", "application/json");
        httpget.setHeader("Authorization", "Bearer sha256d");
        HttpClient httpClient = HttpClients.createDefault();
        HttpResponse response = httpClient.execute((HttpUriRequest) httpget);

        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200){
            System.out.println("Responce Code: " + statusCode);
            String responseBody = EntityUtils.toString((HttpEntity) response.getEntity(), StandardCharsets.UTF_8);
            System.out.println("Response body: " + responseBody);
        } else System.out.println("Error");
    }

}
