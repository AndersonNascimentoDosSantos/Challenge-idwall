package com.idwall.challengeapi.dtos;

import com.idwall.challengeapi.entities.Crimes;

/**
 * CrimesDTO
 */
public class CrimesDTO {

  private Long id;
  private String crime;
  private String description;

  public CrimesDTO(){

  }

  public CrimesDTO(Crimes entity) {
    this.id = entity.getId();
    this.crime = entity.getCrime();
    this.description = entity.getDescription();
  }

  public Long getId() {
    return id;
  }

  public String getCrime() {
    return crime;
  }

  public String getDescription() {
    return description;
  }

}
