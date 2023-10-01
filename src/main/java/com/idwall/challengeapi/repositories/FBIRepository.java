package com.idwall.challengeapi.repositories;

import java.util.List;

import com.idwall.challengeapi.entities.FBI.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FBIRepository extends JpaRepository<Item, String> {
	@Query("SELECT i FROM Item i WHERE i.title LIKE %?1%")
	List<Item> BuscarPorNome(String title);
}
