package com.idwall.challengeapi.interfaces;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.StringJoiner;


public class FBIParameters {

    @SerializedName("nome")
    private String title;

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
    public String buildQueryString(FBIParameters queryParams) {
        StringJoiner queryString = new StringJoiner("&");
        if (queryParams.getTitle() != null) {
            queryString.add("title=" + queryParams.getTitle());
        }
        if (queryParams.getPerson_classification() != null) {
            queryString.add("person_classification=" + queryParams.getPerson_classification());
        }
        if (queryParams.getPoster_classification() != null) {
            queryString.add("poster_classification=" + queryParams.getPoster_classification());
        }
        if (queryParams.getAge_min() != null) {
            queryString.add("age_min=" + queryParams.getAge_min());
        }
        if (queryParams.getAge_max() != null) {
            queryString.add("age_max=" + queryParams.getAge_max());
        }
        if (queryParams.getField_offices() != null) {
            queryString.add("field_offices=" + queryParams.getField_offices());
        }
        if (queryParams.getStatus() != null) {
            queryString.add("status=" + queryParams.getStatus());
        }
        if (queryParams.getSort_on() != null) {
            queryString.add("sort_on=" + queryParams.getSort_on());
        }
        if (queryParams.getSort_order() != null) {
            queryString.add("sort_order=" + queryParams.getSort_order());
        }
        if (queryParams.getPage() != null) {
            queryString.add("page=" + queryParams.getPage());
        }
        if (queryParams.getPageSize() != null) {
            queryString.add("pageSize=" + queryParams.getPageSize());
        }
        return queryString.toString();
    }

}
