package model;

public class Fattorino extends Dipendente {
	private int numConsegne;
	private double pagaBase=5;
	public Fattorino(String nome) {
		super(nome);
		setRuolo("Fattorino");
		
	}

	@Override
	public void calcolastipendio() {
		// TODO Auto-generated method stub
		setStipendio(numConsegne*pagaBase);
	}

}
