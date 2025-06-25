package com.mustfa.ortofrutta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustfa.ortofrutta.models.Prodotto;
@Repository
public interface ProdottoRepo extends JpaRepository<Prodotto, Integer> {


}
