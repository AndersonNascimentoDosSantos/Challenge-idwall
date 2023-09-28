package com.idwall.challengeapi.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * InterpolService
 */
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.entities.Interpol.InterpolResponse;
import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.repositories.InterpolRepository;

@Service
public class InterpolService {
    private String apiUrl = "https://ws-public.interpol.int/notices/v1/red?";
    @Autowired
    private InterpolRepository interpolRepository;
    @Autowired
    private InterpolResponse interpolResponse;
    @Autowired Notice notice;

    public Notice getInterpolData(String name, String forename) {
        try {
            String fullUrl = apiUrl + "&name=" + name + "&forename=" + forename;
            URL url = new URL(fullUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

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
                interpolResponse = gson.fromJson(response.toString(), InterpolResponse.class);

                if (interpolResponse != null && interpolResponse.getEmbedded().getNotices() != null) {

                    String img = interpolResponse.getEmbedded().getNotices().get(0).get_links().getThumb().getHref();
                    notice = interpolResponse.getEmbedded().getNotices().get(0);
                    notice.setImage(img);
                    interpolRepository.save(notice);
                    return interpolResponse.getEmbedded().getNotices().get(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
