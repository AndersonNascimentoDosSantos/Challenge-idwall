package com.idwall.challengeapi.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * PersonCrime
 */
@Entity
@Table(name = "T_PERSON_CRIME")
public class PersonCrime {
  @EmbeddedId
  private PersonCrimePK id = new PersonCrimePK();

  public PersonCrimePK getId() {
    return id;
  }

  public void setId(PersonCrimePK id) {
    this.id = id;
  }

}
