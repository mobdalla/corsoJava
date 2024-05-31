package view;

import java.util.ArrayList;

import controllo.Azienda;
import model.Dipendente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Azienda a1 = new Azienda("swd");
		
		a1.addDipendente("alessandro", "aliberti", "F");
		a1.addDipendente("edoardo", "berah", "F");
		a1.addDipendente("maria", "doro", "I");
		a1.addDipendente("fabio", "melano", "D");
		
		ArrayList<Dipendente> dipendente = a1.getDipendente();
		for (Dipendente dipendente2 : dipendente) {
			System.out.println(dipendente2);
		}
	}

}
