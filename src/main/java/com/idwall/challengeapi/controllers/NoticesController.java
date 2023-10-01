package com.idwall.challengeapi.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.interfaces.InterpolParameters;
import com.idwall.challengeapi.interfaces.QueryParameters;
import com.idwall.challengeapi.services.InterpolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * NoticesController
 */
@RestController
public class NoticesController {
	@Autowired
	private InterpolService interpolService;
	private final ModelMapper modelMapper;

	public NoticesController(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}


	@GetMapping("/coletar-dados-interpol")
	@Transactional
	public Notice getInterpolData(@RequestParam Map<String, String> queryParams) {
		Gson gson = new GsonBuilder().setLenient().create();
		QueryParameters queryParameters = gson.fromJson(queryParams.toString(), QueryParameters.class);

		InterpolParameters interpolParameters = modelMapper.map(queryParameters,InterpolParameters.class);
		return interpolService.getInterpolData(interpolParameters);

	}

	@GetMapping("/interpol")
	public List<Notice> buscarPorNome(@RequestParam String nome) {
		return interpolService.buscarPorNome(nome);
	}

}
