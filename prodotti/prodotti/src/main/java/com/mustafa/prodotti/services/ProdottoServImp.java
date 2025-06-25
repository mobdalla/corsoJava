package com.mustafa.prodotti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.prodotti.models.Prodotto;
import com.mustafa.prodotti.repos.ProdottoRepo;

@Service
public class ProdottoServImp  implements ProdottoService {

    @Autowired
    private ProdottoRepo rep;
    @Override
    public List<Prodotto> getProdotti() {
        return rep.findAll();
    }

    @Override
    public List<Prodotto> getProdottiByCategoria(String categoria) {
        return rep.findByCategoria(categoria);
    }

    @Override
    public Prodotto getProdottoById(int id) {
        return rep.findById(id).orElse(null);
    }

    @Override
    public Prodotto addProdotto(Prodotto p) {
        return rep.save(p);
    }

    @Override
    public Prodotto updateProdotto(Prodotto p) {
        return rep.save(p);
    }

    @Override
    public void delateProdotto(int p) {
        rep.deleteById(p);
    }

}
