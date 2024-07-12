package model;

public class Quadrilatero {
	
	private double l1;
	private double l2;
	private double l3;
	private double l4;
	public Quadrilatero(double l1, double l2, double l3, double l4) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	public double Perimetro() {
		return l1+l2+l3+l4;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrilatero [l1=");
		builder.append(l1);
		builder.append(", l2=");
		builder.append(l2);
		builder.append(", l3=");
		builder.append(l3);
		builder.append(", l4=");
		builder.append(l4);
		builder.append(", Perimetro()=");
		builder.append(Perimetro());
		builder.append("]");
		return builder.toString();
	}
	

}
