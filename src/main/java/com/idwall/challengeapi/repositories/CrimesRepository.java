package com.idwall.challengeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idwall.challengeapi.entities.Crimes;

/**
 * CrimesRepository
 */
public interface CrimesRepository extends JpaRepository <Crimes, Long> {
}
