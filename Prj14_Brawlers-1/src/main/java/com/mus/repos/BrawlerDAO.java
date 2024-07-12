package com.mus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mus.entities.Brawler;

public interface BrawlerDAO  extends JpaRepository<Brawler, Integer>{
	
	List<Brawler> findByRarity(String rarity);
	List<Brawler> findByCarattere(String carattere);

}
