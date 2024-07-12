package com.mus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mus.entities.PokemonPic;
public interface PokemonDAO extends JpaRepository<PokemonPic, String> {
	PokemonPic findByName(String name);
}
