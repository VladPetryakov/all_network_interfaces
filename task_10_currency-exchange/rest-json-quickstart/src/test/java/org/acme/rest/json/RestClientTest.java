package org.acme.rest.json;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RestClientTest {
    @Test
    void getAll() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://jsonplaceholder.typicode.com/users")
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        String responseText = response.body().string();
        System.out.println(responseText);
    }
}