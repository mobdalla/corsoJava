package com.mustfa.ortofrutta.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustfa.ortofrutta.models.Prodotto;
import com.mustfa.ortofrutta.services.ProdottoService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/")
public class ProdottoRest {
    @Autowired
    private ProdottoService prdservice;


    @GetMapping("/prodotti")
    public ResponseEntity<List<Prodotto>> getProdotti() {
        
        return new ResponseEntity<>(prdservice.getProdottti(), HttpStatus.OK);
    }
    
}
