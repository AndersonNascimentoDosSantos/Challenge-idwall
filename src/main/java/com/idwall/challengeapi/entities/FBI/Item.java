package com.idwall.challengeapi.entities.FBI;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "T_FBI_ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @SerializedName("uid")
    private String uid;

    private String title;

    @SerializedName("scars_and_marks")
    private String scarsAndMarks;

    @SerializedName("sex")
    private String sex;

    @SerializedName("publication")
    private String publication;

    private String status;

    public void setImages(List<Imagem> images) {
        this.images = images;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private List<Imagem> images;

    public String getStatus() {
        return status;
    }

    public List<Imagem> getImages() {
        return this.images;
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
