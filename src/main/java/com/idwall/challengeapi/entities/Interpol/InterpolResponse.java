package com.idwall.challengeapi.entities.Interpol;

import org.springframework.stereotype.Component;

/**
 * InterpolResponse
 */
@Component
public class InterpolResponse {

    private int total;
    private Query query;
    private Embedded _embedded;
    private Links _links;

    public int getTotal() {
        return total;
    }
    public Query getQuery() {
        return query;
    }
    public Embedded getEmbedded() {
        return _embedded;
    }
    public Links getLinks() {
        return _links;
    }

}
