package com.idwall.challengeapi.entities.Interpol;

import java.util.List;

import jakarta.persistence.Table;
import org.springframework.stereotype.Component;
import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

/**
 * Notice
 */
@Component
@Entity
@Table
public class Notice {

    @Id
    private String entity_id;
    private String date_of_birth;
    private List<String> nationalities;
    private String forename;
    private String name;
    @SerializedName("_links")
    @Transient
    private Links links;
    private String image;

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
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
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public void setNationalities(List<String> nationalities) {
        this.nationalities = nationalities;
    }
    public void setEntity_id(String entity_id) {
        this.entity_id = entity_id;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLinks(Links links) {
        this.links = links;
    }

}
