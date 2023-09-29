package com.idwall.challengeapi.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
@Service
public class GetResponseString<T> {
    public  T getString(HttpURLConnection connection, Class<T> toClass) throws IOException {
        try (BufferedReader inReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = inReader.readLine()) != null) {
                response.append(inputLine);
            }

            Gson gson = new GsonBuilder().setLenient().create();
            return  gson.fromJson(response.toString(), toClass);
        } finally {
            // Certifique-se de que a conexão seja fechada após o uso
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
