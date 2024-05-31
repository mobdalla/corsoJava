package model;

public class Studenti {
	//pro della 
	private static int counter = 1 ;
	
	//attributi degli oggetti
	private int id;
	private String nome;
	
	private String cognome;

	public Studenti(String nome, String cognome) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.id =Studenti.counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Studenti.counter = counter;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Studenti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	 
		
	

}
