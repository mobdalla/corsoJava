package com.mus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mus.entities.Brawler;
import com.mus.service.BrawlerService;

import jakarta.servlet.http.HttpServlet;

@RestController
@RequestMapping("api")
public class BrawlerRest {
	
	@Autowired
	private BrawlerService service;
	
	@GetMapping("brawlers")
	public ResponseEntity<List<Brawler>> getBrawler(){
		return new ResponseEntity<List<Brawler>>( service.getBrawlers(),HttpStatus.OK);
	}

}
