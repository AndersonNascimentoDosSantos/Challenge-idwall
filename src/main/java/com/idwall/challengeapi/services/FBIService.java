package com.idwall.challengeapi.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.entities.FBI.FBIResponse;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.repositories.FBIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FBIService {
    @Autowired
    private FBIResponse fbiResponse;
    @Autowired
    FBIRepository fbiRepository;
    
    public Item[] BuscarFBI(String nome) {
        try {
            String apiUrl = "https://api.fbi.gov/@wanted?title=" + nome;

            // criar uma conexao http
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configura a requisição http
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            // codigo de resposta http
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader inReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = inReader.readLine()) != null) {
                    response.append(inputLine);
                }

                inReader.close();

                Gson gson = new GsonBuilder().setLenient().create();
                fbiResponse = gson.fromJson(response.toString(), fbiResponse.getClass());

                if (fbiResponse != null && fbiResponse.getItems() != null) {
                    fbiResponse.getItems();
                    for (Item item : fbiResponse.getItems()) {
                        fbiRepository.save(item);
                    }
                }
                return fbiResponse.getItems();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
