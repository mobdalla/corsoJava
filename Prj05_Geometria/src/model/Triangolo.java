package model;

public class Triangolo extends Figura{
	
	private Punto a, b, c;
	private Segamento ab, ac, bc;
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segamento(a,b);
		this.ac = new Segamento(a,c);
		this.bc = new Segamento(a,c);
		this.nome ="Triangolo";
	}
	public double perimetro() {
		return ab.lunghezza() 
				+ ac.lunghezza()
				+ bc.lunghezza();	
	}
	public double area() {
		double sp = perimetro()/2;
		return Math.sqrt(
				sp*
				(sp - ab.lunghezza())*
				(sp - ac.lunghezza())*
				(sp - bc.lunghezza())
				);	
	}
	

}
