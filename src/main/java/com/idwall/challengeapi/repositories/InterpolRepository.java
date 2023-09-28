package com.idwall.challengeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idwall.challengeapi.entities.Interpol.Notice;

/**
 * InterpolRepository
 */
public interface InterpolRepository extends JpaRepository<Notice, String> {

    
}
