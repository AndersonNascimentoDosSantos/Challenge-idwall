package com.idwall.challengeapi.services;

import com.idwall.challengeapi.entities.FBI.FBIResponse;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.repositories.FBIRepository;
import com.idwall.challengeapi.utils.GetConnection;
import com.idwall.challengeapi.utils.GetResponseString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Map;

@Service
public class FBIService {
    @Autowired
    private FBIResponse fbiResponse;
    @Autowired
    FBIRepository fbiRepository;
    private final GetResponseString<FBIResponse> getResponseString;

       public FBIService(GetResponseString<FBIResponse> getResponseString) {
        this.getResponseString = getResponseString;
    }

    public Item[] BuscarFBI(Map<String, String> queryParams) {
        try {
            GetConnection getConnection = new GetConnection();
            HttpURLConnection connection = getConnection.get(queryParams,"https://api.fbi.gov/@wanted");

            // codigo de resposta http
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {

               this.fbiResponse = getResponseString.getString(connection, FBIResponse.class);

                if (fbiResponse != null && fbiResponse.getItems() != null) {
                    fbiResponse.getItems();
                    fbiRepository.saveAll(Arrays.asList(fbiResponse.getItems()));
                }
                assert fbiResponse != null;
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
