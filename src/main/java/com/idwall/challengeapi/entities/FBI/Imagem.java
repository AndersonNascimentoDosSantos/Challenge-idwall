package com.idwall.challengeapi.entities.FBI;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

@Component
public class Imagem {
    @SerializedName("large")
    private String largeURL;

    @SerializedName("thumb")
    private String thumbURL;

    @SerializedName("original")
    private String originalURL;

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
}
