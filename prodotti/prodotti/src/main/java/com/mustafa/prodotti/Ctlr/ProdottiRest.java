package com.mustafa.prodotti.Ctlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.prodotti.models.Prodotto;
import com.mustafa.prodotti.services.ProdottoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api")
public class ProdottiRest {

    @Autowired
    private ProdottoService service;


    @GetMapping("prodotti")
    public List<Prodotto> getProdotto() {
        return service.getProdotti();
    }
     @GetMapping("prodotti/{categoria}")
    public List<Prodotto> getProdotto(@PathVariable String categoria) {
        return service.getProdottiByCategoria(categoria);
    }   
}
