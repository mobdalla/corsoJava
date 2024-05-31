package model;

public abstract class Dipendente {
	private static int matricolatore = 1;
	private int numMatricola;
	private String nome;
	private String cognome;
	protected String ruolo;
	protected double pagabasi;
	
	public Dipendente(String nome, String cognome) {
		this.numMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
		
	}//abs
	public abstract double calcolaSti();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [numMatricola=");
		builder.append(numMatricola);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append(", calcolaSti()=");
		builder.append(calcolaSti());
		builder.append("]");
		return builder.toString();
	}
		
	
}
