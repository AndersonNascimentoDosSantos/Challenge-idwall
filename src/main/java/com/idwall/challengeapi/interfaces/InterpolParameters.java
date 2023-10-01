package com.idwall.challengeapi.interfaces;

import com.google.gson.annotations.SerializedName;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.StringJoiner;

public class InterpolParameters {
    @SerializedName("nome")
    private String forename;
    @SerializedName("pais_origem")
    private String nationality;
    @SerializedName("sexo")
    private String gender;
    @SerializedName("nascimento")
    private String birth_date;
    @SerializedName("procurado_por")
    private String wanted_for;
    @SerializedName("localizacao")
    private String location;

    public String getName() {
        return forename;
    }

    public void setName(String forename) {
        this.forename = forename;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getWanted_for() {
        return wanted_for;
    }

    public void setWanted_for(String wanted_for) {
        this.wanted_for = wanted_for;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String buildQueryString() {
        StringJoiner queryString = new StringJoiner("&");
        if (forename != null) {
            queryString.add("forename=" + forename);
        }
        if (nationality != null) {
            queryString.add("nationality=" + nationality);
        }
        if (gender != null) {
            queryString.add("gender=" + gender);
        }
        if (birth_date != null) {
            queryString.add("birth_date=" + birth_date);
        }
        if (wanted_for != null) {
            queryString.add("wanted_for=" + wanted_for);
        }
        if (location != null) {
            queryString.add("location=" + location);
        }
        return queryString.toString();
    }


}

