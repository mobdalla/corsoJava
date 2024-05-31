package classi;

public class Libro {
   
	
	private int codice;
	private String titolo;
	private String autore;
	
	public Libro( String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo.toUpperCase();
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getCodice() {
		return codice;
	}
	
}
