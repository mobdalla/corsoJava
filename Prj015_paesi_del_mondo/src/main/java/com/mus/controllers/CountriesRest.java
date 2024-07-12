package com.mus.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.mus.entities.Countries;
import com.mus.services.CountriesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("api")
public class CountriesRest {

	@Autowired
	CountriesService ser;
	
	@GetMapping("countries")
	public ResponseEntity<List<Countries>> getBrawler(){
		return new ResponseEntity<List<Countries>>( ser.getCountries(),HttpStatus.OK);
	}
	
}
