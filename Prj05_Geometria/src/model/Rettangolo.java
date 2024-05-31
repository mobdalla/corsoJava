package model;

public class Rettangolo extends Figura {
	private Segamento base, altezza ;

  	public Rettangolo(Segamento base, Segamento altezza) {
	super();
	this.base = base;
	this.altezza = altezza;
	this.nome = "Rettangolo";
  	}
  
  	public double area() {
  		return base.lunghezza() * altezza.lunghezza();
  		}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
  	
}
