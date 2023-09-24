package com.idwall.challengeapi.entities.FBI;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "T_FBI_IMAGES")
public class Imagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @SerializedName("large")
    private String largeURL;

    @SerializedName("thumb")
    private String thumbURL;

    @SerializedName("original")
    private String originalURL;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    // Adicione getters para os campos acima
    public String getLargeURL() {
        return largeURL;
    }

    public String getThumbURL() {
        return thumbURL;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
