package com.idwall.challengeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.services.InterpolService;

import java.util.List;
import java.util.Map;

import jakarta.transaction.Transactional;

/**
 * NoticesController
 */
@RestController
public class NoticesController {
	@Autowired
	private InterpolService interpolService;

	@GetMapping("/coletar-dados-interpol")
	@Transactional
	public Notice getInterpolData(@RequestParam Map<String, String> queryParams) {
		return interpolService.getInterpolData(queryParams);

	}

	@GetMapping("/interpol")
	public List<Notice> buscarPorNome(@RequestParam String nome) {
		return interpolService.buscarPorNome(nome);
	}

}
