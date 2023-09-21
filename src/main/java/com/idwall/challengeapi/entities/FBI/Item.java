package com.idwall.challengeapi.entities.FBI;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Item {
    private String title;
    @SerializedName("scars_and_marks")
    private String scarsAndMarks;
    private String publication;
    private String status;
    private ArrayList<Imagem> images;

    public String getStatus() {
        return status;
    }

    public ArrayList<String> getImages() {
        ArrayList<String> imgUrls = new ArrayList<>();
        for (Imagem imagem : images) {
            imgUrls.add(imagem.getLargeURL());
            imgUrls.add(imagem.getOriginalURL());
        }
        return imgUrls;
    }

    public String getTitle() {
        return title;
    }

    public String getScarsAndMarks() {
        return scarsAndMarks;
    }

    public String getPublication() {
        return publication;
    }
}
