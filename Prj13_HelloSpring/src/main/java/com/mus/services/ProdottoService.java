package com.mus.services;

import java.util.List;

import com.mus.entities.Prodotto;

public interface ProdottoService  {
	List<Prodotto> getProdotti();
	Prodotto addProdotto(Prodotto p);
}
