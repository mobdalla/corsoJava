package com.mustfa.ortofrutta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustfa.ortofrutta.models.Prodotto;
import com.mustfa.ortofrutta.repos.ProdottoRepo;

@Service
public class ProdottoServiceImp implements ProdottoService {

    @Autowired
    private ProdottoRepo rpdRepo;
   
    @Override
    public List<Prodotto> getProdottti() {

        return rpdRepo.findAll();
    }

    @Override
    public List<Prodotto> getProdottiByCategoria(String categoria) {
        return rpdRepo.findAll()
                      .stream()
                      .filter(p->p.getCategoria().equals(categoria))
                      .toList();
    }

    @Override
    public Prodotto addProdotto(Prodotto p) {
        return rpdRepo.save(p);
    }

    @Override
    public Prodotto getProdottoById(int id) {
        return rpdRepo.findById(id).orElseThrow();
    }

}
