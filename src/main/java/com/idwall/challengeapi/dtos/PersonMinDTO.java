package com.idwall.challengeapi.dtos;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.idwall.challengeapi.entities.Agency;
import com.idwall.challengeapi.entities.Crimes;
import com.idwall.challengeapi.entities.Person;

public class PersonMinDTO {
  private String name;
  private String nacionalities;
  private LocalDate birthDate;
  private char sex;
  private Agency agency;
  private Crimes crimes;

  public PersonMinDTO() {
  }

  public PersonMinDTO(Person entity) {
    // copia as propriedades do objeto person para cá
    BeanUtils.copyProperties(entity, this);
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNacionalities() {
    return nacionalities;
  }

  public void setNacionalities(String nacionalities) {
    this.nacionalities = nacionalities;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }


  public String getAgency() {
    return agency.getName();
  }

  public void setAgency(Agency agency) {
    this.agency = agency;
  }

  public String getCrimes() {
    return crimes.getCrime();
  }

  public void setCrimes(Crimes crimes) {
    this.crimes = crimes;
  }
}
