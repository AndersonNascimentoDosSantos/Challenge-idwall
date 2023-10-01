package com.idwall.challengeapi.controllers;

import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.services.FBIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WantedController {
    @Autowired
    private FBIService fbiService;

    @GetMapping("/coletar-dados-fbi")
    public Item[] getWantedList(@RequestParam Map<String, String> queryParams) {
        return fbiService.BuscarFBI(queryParams);
    }

	@GetMapping("/fbi-wanted")
	public List<Item> buscarPorNome(@RequestParam String title) {
		return fbiService.BuscarPorNomeDB(title);
	}
}
