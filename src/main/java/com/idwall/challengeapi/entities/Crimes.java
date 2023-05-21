package com.idwall.challengeapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Crimes
 */
@Entity
@Table(name = "T_CRIMES")
public class Crimes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String crime;
  private String description;

  public Crimes() {
  }

  public Crimes(Long id, String crime, String description) {
    this.id = id;
    this.crime = crime;
    this.description = description;
    
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCrime() {
    return crime;
  }

  public void setCrime(String crime) {
    this.crime = crime;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  

}
