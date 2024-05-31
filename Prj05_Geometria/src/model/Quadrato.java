package model;

public class Quadrato extends Rettangolo {
	
	private Segamento lato;
	
	public Quadrato(Segamento lato ) {
		super(lato, lato);
		this.lato = lato;
		this.nome ="Quadrato";
	}
	@Override
	public double area() {
		return Math.pow(this.lato.lunghezza(),2);
	}
}
