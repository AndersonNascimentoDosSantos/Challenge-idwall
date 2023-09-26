package com.idwall.challengeapi.entities.Interpol;

import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

/**
 * Notice
 */
@Component
public class Notice {

    private String date_of_birth;
    private List<String> nationalities;
    private String entity_id;
    private String forename;
    private String name;
    @SerializedName("_links")
    private Links links;

    public String getDate_of_birth() {
        return date_of_birth;
    }
    public List<String> getNationalities() {
        return nationalities;
    }
    public String getEntity_id() {
        return entity_id;
    }
    public String getForename() {
        return forename;
    }
    public String getName() {
        return name;
    }
    public Links get_links() {
        return links;
    }
}
