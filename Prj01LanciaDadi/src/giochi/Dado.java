package giochi;

public class Dado {

	int facce = 6 ;
	int facciaUscita =1; //dichiarazione e assegnazione
	public void lancia() {
		
		facciaUscita = (int)  (Math.random() * facce) + 1 ; //0.0 - 0.99999999999999999999999999
		
		
	}
}
