package model;

public class Dirigente extends Dipendente {
	
	private int dipendAsse;
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.ruolo= "Dirifente";
	}

	@Override
	public double calcolaSti() {
		// TODO Auto-generated method stub
		return dipendAsse * pagabasi *10;
	}

	public int getDipendAsse() {
		return dipendAsse;
	}

	public void setDipendAsse(int dipendAsse) {
		this.dipendAsse = dipendAsse;
	}
	

}
