package com.mus.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class Countries {
	
	@Id
	private String alpha2code;
	
	private String capital;
	private String name;
	private String region;
	
	public String getAlpha2code() {
		return alpha2code;
	}
	public void setAlpha2code(String alpha2code) {
		this.alpha2code = alpha2code;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
