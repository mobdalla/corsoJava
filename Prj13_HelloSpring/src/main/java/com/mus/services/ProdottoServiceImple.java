package com.mus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mus.entities.Prodotto;
import com.mus.repos.ProdottoDAO;
@Service
public class ProdottoServiceImple implements ProdottoService {
	
	@Autowired
	private ProdottoDAO dao;
	
	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

}
