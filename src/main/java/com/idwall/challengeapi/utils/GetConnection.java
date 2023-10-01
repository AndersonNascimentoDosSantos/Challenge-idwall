package com.idwall.challengeapi.utils;

import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.interfaces.InterpolParameters;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class GetConnection<T> {
    public HttpURLConnection get(T queryParams, String baseUrl) throws IOException {

        String queryString = buildQueryString(queryParams);
        String apiUrl = baseUrl + "?" + queryString;

        // criar uma conexao http
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Configura a requisição http
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        return connection;
    }
    private String buildQueryString(T queryParams) {
        // Verifique se o objeto queryParams tem um método buildQueryString() definido
        // e chame esse método para construir a string de consulta.
        if (queryParams instanceof InterpolParameters) {
            return ((InterpolParameters) queryParams).buildQueryString();
        } else if (queryParams instanceof FBIParameters) {
            return ((FBIParameters) queryParams).buildQueryString((FBIParameters) queryParams);
        }

        // Retorne uma string vazia ou lide com outros tipos de queryParams, se necessário.
        return "";
    }
}
