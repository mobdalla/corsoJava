package classi;

public class Cc {
	
	private int nCont;
	private String titolare;
	private double saldo;
	
	public String getTitolare() {
		return titolare;
	}
	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}
	
	public void versamento(double amount) {
		this.saldo+= amount;
	} 
	public double prelievo(double amount) {
		if (this.saldo >= amount) {
			this.saldo -= amount;
		}
		System.out.println("Disponibilita insuffiecie, prelievo annullato");
		return 0;
	}
	@Override
	public String toString() {
		return "Cc [nCont=" + nCont + ", titolare=" + titolare + ", saldo=" + saldo + "]";
	}
	
}
