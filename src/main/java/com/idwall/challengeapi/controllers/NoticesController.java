package com.idwall.challengeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.services.InterpolService;

import jakarta.transaction.Transactional;

/**
 * NoticesController
 */
@RestController
public class NoticesController {
    @Autowired
    private InterpolService interpolService;

    @GetMapping("/interpol-data")
    @Transactional
    public Notice getInterpolData(
            @RequestParam(name = "name", required = true) String name,
            @RequestParam(name = "forename", required = true) String forename) {
        return interpolService.getInterpolData(name, forename);
    }

}
