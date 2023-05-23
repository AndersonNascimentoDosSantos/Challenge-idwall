package com.idwall.challengeapi.dtos;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.idwall.challengeapi.entities.Agency;
import com.idwall.challengeapi.entities.Crimes;
import com.idwall.challengeapi.entities.Person;

public class PersonDTO {
  private Long id;
  private String name;
  private String nacionalities;
  private Byte[] img;
  private LocalDate birthDate;
  private char sex;
  private int heightMin;
  private int heightMax;
  private int ageMin;
  private int ageMax;
  private Agency agency;
  private Crimes crimes;

  public PersonDTO() {
  }

  public PersonDTO(Person entity) {
    // copia as propriedades do objeto person para cá
    BeanUtils.copyProperties(entity, this);
  }

  // por causa do uso do BeanUtils, é necessário adicionar setters ao DTO também
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Byte[] getImg() {
    return img;
  }

  public void setImg(Byte[] img) {
    this.img = img;
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

  public int getHeightMin() {
    return heightMin;
  }

  public void setHeightMin(int heightMin) {
    this.heightMin = heightMin;
  }

  public int getHeightMax() {
    return heightMax;
  }

  public void setHeightMax(int heightMax) {
    this.heightMax = heightMax;
  }

  public int getAgeMin() {
    return ageMin;
  }

  public void setAgeMin(int ageMin) {
    this.ageMin = ageMin;
  }

  public int getAgeMax() {
    return ageMax;
  }

  public void setAgeMax(int ageMax) {
    this.ageMax = ageMax;
  }

  public String getAgency() {
    return agency.getName();
  }

  public void setAgency(Agency agency) {
    this.agency = agency;
  }

  public Crimes getCrimes() {
    return crimes;
  }

  public void setCrimes(Crimes crimes) {
    this.crimes = crimes;
  }

}
