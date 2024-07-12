package com.musty.interfaccia;

public class Libro implements Comparable<Libro> {

	public String titolo;
	public int pagine;
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.pagine - o.pagine;
	}
	
}

