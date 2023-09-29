package com.idwall.challengeapi.services;

import com.idwall.challengeapi.entities.Interpol.InterpolResponse;
import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.utils.GetConnection;
import com.idwall.challengeapi.utils.GetResponseString;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.util.Map;

@Service
public class InterpolService {

    private final GetResponseString<InterpolResponse> getResponseString;

    public InterpolService(GetResponseString<InterpolResponse> getResponseString) {
        this.getResponseString = getResponseString;
    }

    public Notice getInterpolData(Map<String, String> queryParams) {
        try {
            String apiUrl = "https://ws-public.interpol.int/notices/v1/red";
            GetConnection getConnection = new GetConnection();
            HttpURLConnection connection = getConnection.get(queryParams, apiUrl);
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {

                InterpolResponse interpolResponse = getResponseString.getString(connection, InterpolResponse.class);
                if (interpolResponse != null && interpolResponse.getEmbedded().getNotices() != null) {
                    return interpolResponse.getEmbedded().getNotices().get(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
