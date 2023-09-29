package com.idwall.challengeapi.utils;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.StringJoiner;
@Service
public class GetConnection {
    public  HttpURLConnection get(Map<String, String> queryParams,String baseUrl) throws IOException {
        StringJoiner queryString = new StringJoiner("&");
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            queryString.add(entry.getKey() + "=" + entry.getValue());
        }
        String apiUrl = baseUrl +"?"+ queryString;

        // criar uma conexao http
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Configura a requisição http
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        return connection;
    }
}
