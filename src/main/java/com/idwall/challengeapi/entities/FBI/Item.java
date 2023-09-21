package com.idwall.challengeapi.entities.FBI;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name = "T_FBI_ITEM")
public class Item {

    @Id
    private String uid;
    private String title;
    @SerializedName("scars_and_marks")
    private String scarsAndMarks;
    private String sex;
    private String publication;
    private String status;

    public void setImages(ArrayList<Imagem> images) {
        this.images = images;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<Imagem> images;

    public String getStatus() {
        return status;
    }

    public List<String> getImages() {
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
