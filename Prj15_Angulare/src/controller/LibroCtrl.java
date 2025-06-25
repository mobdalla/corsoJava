package controller;


import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroCtrl {

	private List<Libro> libri ;

	
	public LibroCtrl() {
		this.libri = new ArrayList<>();
	}
	public void addLibro(Libro l) {
		this.libri.add(l);
	}
	public List<Libro> getLibro(){
		return this.libri;
	}
}
