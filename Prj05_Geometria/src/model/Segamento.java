package model;

public class Segamento {
  
	private Punto a, b;

	public Segamento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	public double lunghezza() {
		
		
		return Math.sqrt(
				Math.pow(a.getX() - b. getX(), 2)
				+
				Math.pow(a.getY() - b. getY(), 2)
				);
	}
	@Override
	public String toString() {
		return "Segamento [a=" + a + ", b=" + b + ", lunghezza()=" + lunghezza() + "]";
	}

	
	
}
