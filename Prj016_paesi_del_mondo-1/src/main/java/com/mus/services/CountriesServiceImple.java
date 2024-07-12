package com.mus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mus.entities.Countries;
import com.mus.repos.CountriesDAO;
@Service
public class CountriesServiceImple implements CountriesService {

	@Autowired
	private CountriesDAO dao;
	@Override
	public List<Countries> getCountries() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
//	@Override
//	public Countries getCountriesByCode(String alpha2code) {
//		// TODO Auto-generated method stub
//		return dao.getReferenceById(alpha2code);
//	}

}
