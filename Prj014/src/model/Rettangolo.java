package model;

public class Rettangolo extends Quadrilatero {
	private double p, a;
	public Rettangolo(double base, double altezza) {
		super(base, altezza, base, altezza);
		 this.p=base;
		 this.a=altezza;
			
		// TODO Auto-generated constructor stub
	}
	public double Area() {
		return p*a;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [p=");
		builder.append(p);
		builder.append(", a=");
		builder.append(a);
		builder.append(", Area()=");
		builder.append(Area());
		builder.append(", Peri()=");
		builder.append(Perimetro());
		builder.append("]");
		return builder.toString();
	}
	

}
