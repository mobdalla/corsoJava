package com.mus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mus.entities.PokemonPic;
import com.mus.services.PokemonPicSer;
@RestController
public class PokemonPicRest {

	@Autowired
	private PokemonPicSer service;
	
	@GetMapping("pokemon")
	List<PokemonPic> getPokemonPic(){
		return service.getPokemonPic();
		
	}
	@GetMapping("pokemon/{name}")
	PokemonPic getPokemonPicByName(@PathVariable String name) {
		
		return service.getPokemonByName(name);
		
	}
	
	
}
