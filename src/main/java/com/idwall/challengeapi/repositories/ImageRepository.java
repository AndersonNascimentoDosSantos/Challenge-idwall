package com.idwall.challengeapi.repositories;

import com.idwall.challengeapi.entities.FBI.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository <Imagem, String> {
}
