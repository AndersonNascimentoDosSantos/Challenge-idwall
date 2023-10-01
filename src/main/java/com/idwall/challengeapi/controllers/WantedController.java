package com.idwall.challengeapi.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.interfaces.QueryParameters;
import com.idwall.challengeapi.services.FBIService;
import org.modelmapper.ModelMapper;
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
    private final ModelMapper modelMapper;

    public WantedController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping("/coletar-dados-fbi")
    public Item[] getWantedList(@RequestParam Map<String, String> queryParams) {
        Gson gson = new GsonBuilder().setLenient().create();
        QueryParameters queryParameters = gson.fromJson(queryParams.toString(), QueryParameters.class);
        FBIParameters fbiParameters = modelMapper.map(queryParameters,FBIParameters.class);
        return fbiService.BuscarFBI(fbiParameters);
    }

	@GetMapping("/fbi-wanted")
	public List<Item> buscarPorNome(@RequestParam String title) {
		return fbiService.BuscarPorNomeDB(title);
	}
}
