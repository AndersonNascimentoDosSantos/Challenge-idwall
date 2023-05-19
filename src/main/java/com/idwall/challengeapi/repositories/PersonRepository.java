package com.idwall.challengeapi.repositories;

import com.idwall.challengeapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
