package com.mustafa.prodotti.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mustafa.prodotti.models.Prodotto;

@Service
public interface ProdottoService {

    List<Prodotto> getProdotti();
    List<Prodotto> getProdottiByCategoria(String categoria);
    Prodotto getProdottoById(int id);

    Prodotto addProdotto(Prodotto p);
    Prodotto updateProdotto(Prodotto p);
    void delateProdotto(int p);
}
