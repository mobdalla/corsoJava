package pubblico;

import model.Impiegato;
import controller.Aziende;
public class Main {

	public static void main(String[] args) {
	   
		Aziende toyota = new Aziende(4);
		Aziende mercedes = new Aziende(3);
		
		Impiegato i1 = new Impiegato("paolo", "rossi", 2000);
		toyota.addImpiegato(i1);
		Impiegato i2 = new Impiegato("mario", "rossi", 2003);
		toyota.addImpiegato(i2);
		Impiegato i3 = new Impiegato("mario", "rossi", 2003);
		i3.setStipendio(1500);
		toyota.addImpiegato(i3);
		toyota.addImpiegato(new Impiegato("giovanna", "rossi", 1987));
		toyota.addImpiegato(new Impiegato("giovanna2", "rossi", 1968));
		
		toyota.addImpiegato(new Impiegato("giovanna3", "rossi", 2009));
		System.out.println(toyota.getDipendenti());
		System.out.println("Totale ");
		System.out.println(toyota.calcolaStipendioTot());
	
		
	}
			
}
