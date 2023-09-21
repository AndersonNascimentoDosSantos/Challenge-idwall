package com.idwall.challengeapi.repositories;

import com.idwall.challengeapi.entities.FBI.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FBIRepository extends JpaRepository<Item, String> {
}
