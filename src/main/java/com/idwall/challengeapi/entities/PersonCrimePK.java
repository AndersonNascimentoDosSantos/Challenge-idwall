package com.idwall.challengeapi.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * PersonCrimePK
 */
@Embeddable
public class PersonCrimePK {

  @ManyToOne
  @JoinColumn(name = "person_id")
  private Person person;

  @ManyToOne
  @JoinColumn(name = "crime_id")
  private Crimes crimes;

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Crimes getCrimes() {
    return crimes;
  }

  public void setCrimes(Crimes crimes) {
    this.crimes = crimes;
  }

}
