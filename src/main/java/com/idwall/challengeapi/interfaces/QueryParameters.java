package com.idwall.challengeapi.interfaces;

public class QueryParameters {

//    @SerializedName("title")
    private String nome;

//    @SerializedName("person_classification")
    private String classificacao_pessoa;
//    @SerializedName("poster_classification")
    private String classificacao_cartaz;
//    @SerializedName("age_min")
    private Integer idade_mminima;

//    @SerializedName("age_max")
    private Integer idade_maxima;

//    @SerializedName("offices")
    private String escritorio;

//    @SerializedName("status")
    private String status;

//    @SerializedName("sort_order")
    private String sort_order;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao_pessoa() {
        return classificacao_pessoa;
    }

    public void setClassificacao_pessoa(String classificacao_pessoa) {
        this.classificacao_pessoa = classificacao_pessoa;
    }

    public String getClassificacao_cartaz() {
        return classificacao_cartaz;
    }

    public void setClassificacao_cartaz(String classificacao_cartaz) {
        this.classificacao_cartaz = classificacao_cartaz;
    }

    public Integer getIdade_mminima() {
        return idade_mminima;
    }

    public void setIdade_mminima(Integer idade_mminima) {
        this.idade_mminima = idade_mminima;
    }

    public Integer getIdade_maxima() {
        return idade_maxima;
    }

    public void setIdade_maxima(Integer idade_maxima) {
        this.idade_maxima = idade_maxima;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String escritorio) {
        this.escritorio = escritorio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSort_order() {
        return sort_order;
    }

    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }
}
