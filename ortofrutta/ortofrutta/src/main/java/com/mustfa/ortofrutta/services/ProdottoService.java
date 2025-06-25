package com.mustfa.ortofrutta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mustfa.ortofrutta.models.Prodotto;

@Service
public interface ProdottoService {

    List<Prodotto> getProdottti();

    List<Prodotto> getProdottiByCategoria(String categoria);

    Prodotto addProdotto(Prodotto p);

    Prodotto getProdottoById(int id);


}
