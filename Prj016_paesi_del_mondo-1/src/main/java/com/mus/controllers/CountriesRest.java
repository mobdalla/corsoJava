package com.mus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.mus.entities.Countries;
import com.mus.services.CountriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api")
public class CountriesRest {

	@Autowired
	private CountriesService service;
	
	@GetMapping("countries")
	public ResponseEntity<List<Countries>>  getCountriess(){
		return new ResponseEntity<List<Countries>> (service.getCountries(), HttpStatus.OK);
	}
}
