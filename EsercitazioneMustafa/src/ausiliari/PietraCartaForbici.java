package ausiliari;

import java.util.Scanner;

public class PietraCartaForbici {

	public static void main(String[] args) {
		
		//String menu = menu();
		System.out.println(menu());
		String SceltaUmano = chiediUmano();
		String seltaPC = cheidPC();
		System.out.println("Umano: "+ SceltaUmano);
		System.out.println("PC; "+ seltaPC);
		String result= valuta(SceltaUmano, seltaPC);
		System.out.println("il risultato è " + result);
	}


	private static String valuta(String sceltaUmano, String seltaPC) {
		// TODO Auto-generated method stub
		String result= null;
		if (sceltaUmano.equalsIgnoreCase(seltaPC))
			result= "PAREGGIO";
		else {
			switch (sceltaUmano.toUpperCase()) {
			case "P":
				if (seltaPC.equalsIgnoreCase("F"))
					result = "UMANO";
				else
					result ="PC";
				break;
			case "F":
				if (seltaPC.equalsIgnoreCase("C"))
					result = "UMANO";
				else
					result ="PC";
				break;
			case "C":
				if (seltaPC.equalsIgnoreCase("P"))
					result = "UMANO";
				else
					result ="PC";
				break;
			default:
				result ="Qualcuno non è stato corretto! la macchina è sempre";
				break;
			}
		}		
		return result;
	}
	private static String cheidPC() {
		String scelta ="P";
		double casuale = Math.random();
		if (casuale < 0.33)
			scelta ="C";
		else if (casuale < 0.66)
			scelta = "F";
		
		return scelta;
	}
	private static String chiediUmano() {
		System.out.println("Inserisci la tua scelta");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	private static String menu() {// static = appartiene alla  classe
		// TODO Auto-generated method stub
		
		return "Scegli tra \n P) pietra \n F) Forbici \n C) Carta";
	}
}
