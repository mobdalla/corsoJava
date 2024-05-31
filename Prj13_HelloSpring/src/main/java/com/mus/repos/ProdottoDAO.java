package com.mus.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mus.entities.Prodotto;
import java.util.List;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {
		
}
