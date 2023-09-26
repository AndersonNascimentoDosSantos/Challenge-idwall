package com.idwall.challengeapi.entities.Interpol;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * Embedded
 */
@Component
public class Embedded {

    private List<Notice> notices;

    public List<Notice> getNotices() {
        return notices;
    }

}
