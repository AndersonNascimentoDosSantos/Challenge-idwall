package com.idwall.challengeapi.entities;

import jakarta.persistence.*;

import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table(name = "T_PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nacionalities;
    @Column(name = "img")
    private Byte[] img;
    @Column(name = "dt_birth")
    private LocalDate birthDate;
    @Column(name = "sex_id")
    private char sex;
    private int heightMin;
    private int heightMax;
    private int ageMin;
    private int ageMax;

    @ManyToOne
    @JoinColumn(name = "id")
    private Agency agency;


    public Person() {
    }

    public Person(Long id, String name, String nacionalities, Byte[] img, LocalDate birthDate, char sex, int heightMin, int heightMax, int ageMin, int ageMax, Agency agency) {

        this.id = id;
        this.name = name;
        this.nacionalities = nacionalities;
        this.img = img;
        this.birthDate = birthDate;
        this.sex = sex;
        this.heightMin = heightMin;
        this.heightMax = heightMax;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.agency = agency;
    }

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

    public Agency getAgency() {
        return agency;
      }
    
    public void setAgency(Agency agency) {
    this.agency = agency;
    }
}
