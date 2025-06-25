package com.mus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mus.entities.Countries;

public interface CountriesDAO extends JpaRepository<Countries,String> {
	
	//List<Countries>  findCountries();
	
	List<Countries> findByName(String name);

}
