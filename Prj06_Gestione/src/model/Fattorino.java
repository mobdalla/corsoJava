package model;

public class Fattorino extends Dipendente {
	private int numC;
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		this.ruolo ="Fattorino";
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcolaSti() {
		// TODO Auto-generated method stub
		return numC * pagabasi;
	}
	public int getNumC() {
		return numC;
	}
	public void setNumC(int numC) {
		this.numC = numC;
	}
	
	

}
