package com.mustfa.ortofrutta.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mustfa.ortofrutta.services.ProdottoService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProdottoMVC {

    @Autowired
    private ProdottoService prs;


    @GetMapping("/prodotti")
    public String getProdotti(Model m) {
        m.addAttribute("prodotti", prs.getProdottti());
        return "prodotti";
    }
    


}
