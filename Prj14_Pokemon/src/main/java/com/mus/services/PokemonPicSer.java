package com.mus.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mus.entities.PokemonPic;

public interface PokemonPicSer {
	
	 List<PokemonPic> getPokemonPic();
	  PokemonPic getPokemonByName(String name);
	// public void getPokemonPic();
	// public void getPokemonByName();
	 
}
