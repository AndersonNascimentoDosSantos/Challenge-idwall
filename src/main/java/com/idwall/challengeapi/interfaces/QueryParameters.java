package com.idwall.challengeapi.interfaces;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class QueryParameters {
    @SerializedName("nome")
    private String title;

    private String name;
    @SerializedName("classificacao_pessoa")
    private String person_classification;
    @SerializedName("classificacao_cartaz")
    private String poster_classification;
    @SerializedName("idade_minima")
    private Integer age_min;

    @SerializedName("idade_maxima")
    private Integer age_max;

    @SerializedName("escritorio")
    private String field_offices;

    @SerializedName("status")
    private String status;
    @SerializedName("sort_data")
    private String sort_on;
    @SerializedName("sort_order")
    private String sort_order;
    @SerializedName("page")
    private Integer page;
    @SerializedName("limit")
    private Integer pageSize;

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
    public QueryParameters() {
        // Construtor padrão
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerson_classification() {
        return person_classification;
    }

    public void setPerson_classification(String person_classification) {
        this.person_classification = person_classification;
    }

    public String getPoster_classification() {
        return poster_classification;
    }

    public void setPoster_classification(String poster_classification) {
        this.poster_classification = poster_classification;
    }

    public Integer getAge_min() {
        return age_min;
    }

    public void setAge_min(Integer age_min) {
        this.age_min = age_min;
    }

    public Integer getAge_max() {
        return age_max;
    }

    public void setAge_max(Integer age_max) {
        this.age_max = age_max;
    }

    public String getField_offices() {
        return field_offices;
    }

    public void setField_offices(String field_offices) {
        this.field_offices = field_offices;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSort_on() {
        return sort_on;
    }

    public void setSort_on(String sort_on) {
        this.sort_on = sort_on;
    }

    public String getSort_order() {
        return sort_order;
    }

    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
