package model;

public class Impiegato extends Dipendente {
	private int orelav;
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		this.ruolo = "Impiegato";
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaSti() {
		// TODO Auto-generated method stub
		return orelav*pagabasi;
	}

	public int getOrelav() {
		return orelav;
	}

	public void setOrelav(int orelav) {
		this.orelav = orelav;
	}
	
}
