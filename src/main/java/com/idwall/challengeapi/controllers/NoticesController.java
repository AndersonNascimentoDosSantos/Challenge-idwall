package com.idwall.challengeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.services.InterpolService;

import java.util.Map;

/**
 * NoticesController
 */
@RestController
public class NoticesController {
    @Autowired
    private InterpolService interpolService;

    @GetMapping("/coletar-dados-interpol")
    public Notice getInterpolData(@RequestParam Map<String, String> queryParams) {
        return interpolService.getInterpolData(queryParams);
    }

}
