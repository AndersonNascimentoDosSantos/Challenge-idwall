package com.idwall.challengeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.idwall.challengeapi.entities.Interpol.Notice;

/**
 * InterpolRepository
 */
public interface InterpolRepository extends JpaRepository<Notice, String> {

	@Query("SELECT n FROM Notice n WHERE n.forename LIKE %?1%")
	List<Notice> buscarPorNome(String nome);
    
}
