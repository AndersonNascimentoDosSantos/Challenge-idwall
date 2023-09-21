package com.idwall.challengeapi.controllers;

import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.services.FBIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WantedController {
    @Autowired
    private FBIService fbiService;

    @GetMapping("/wanted")
    public Item[] getWantedList(@RequestParam String nome) {
        return fbiService.BuscarFBI(nome);
    }

}
