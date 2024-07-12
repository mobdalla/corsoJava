package model;

import java.util.Objects;

public class Libro {
	
	private static int counter =1;
	private int id;
	
	private String titolo;
	private int pagine;
	private double prezzo;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(pagine, titolo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return pagine == other.pagine && Objects.equals(titolo, other.titolo);
	}


	public Libro() {
		this.id = counter++;
	}
	
	
	public Libro(String titolo) {
		this();
		this.titolo = titolo.toUpperCase();
	}


	public Libro(String titolo, int pagine) {
		this(titolo);
		
		this.pagine = pagine;
	}


	public Libro(String titolo, int pagine, double prezzo) {
		this(titolo, pagine);
		this.prezzo = prezzo;
	}


	public int getId() {
		return id;
	}


	public String getTitolo() {
		return titolo;
	}
	
	
	
	
	
	
}
