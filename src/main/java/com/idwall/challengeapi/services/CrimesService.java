package com.idwall.challengeapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.idwall.challengeapi.dtos.CrimesDTO;
import com.idwall.challengeapi.entities.Crimes;
import com.idwall.challengeapi.repositories.CrimesRepository;

/**
 * CrimesService
 */
@Service
public class CrimesService {

  @Autowired
  private CrimesRepository crimesRepository;

  public CrimesDTO findByCrime(Long id) {
    Crimes result = crimesRepository.findById(id).orElse(null);
    if (result == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Crime not fount with ID " + id);
    }
    return new CrimesDTO(result);
  }

  public List<CrimesDTO> findAll() {
    List<Crimes> result = crimesRepository.findAll();
    return result.stream().map(x -> new CrimesDTO(x)).toList();
  }

}
