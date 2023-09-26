package com.idwall.challengeapi.entities.Interpol;

import org.springframework.stereotype.Component;

/**
 * Query
 */
@Component
public class Query {

    private int page;
    private int resultPerPage;
    private String name;
    private String forename;

    public int getPage() {
        return page;
    }
    public int getResultPerPage() {
        return resultPerPage;
    }
    public String getName() {
        return name;
    }
    public String getForename() {
        return forename;
    } 
}
