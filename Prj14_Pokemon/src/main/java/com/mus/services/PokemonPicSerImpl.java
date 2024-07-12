package com.mus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mus.entities.PokemonPic;
import com.mus.repos.PokemonDAO;
@Service
public class PokemonPicSerImpl implements PokemonPicSer {
	
	@Autowired
	private PokemonDAO dao;
	@Override
	public List<PokemonPic> getPokemonPic() {
		// TODO Auto-generated method stub
		return  dao.findAll();
	}
	@Override
//	public PokemonPic getPokemonByName(String name) {
//		// TODO Auto-generated method stub
//		return dao.findByName(name);
//	}
	public PokemonPic getPokemonByName(String name) {
		// TODO Auto-generated method stub
		for (PokemonPic pokes : dao.findAll()) {
			if(pokes.getName().equals(name)) {
				return pokes ;
			}
			
		}
		//return dao.findByName(name);
		return null;
	}
	

	
	
}
