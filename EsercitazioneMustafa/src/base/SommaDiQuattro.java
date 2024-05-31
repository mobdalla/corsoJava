package base;

import java.util.Scanner;

public class SommaDiQuattro {

	public static void main(String[] args) {
		int somma = 0;
	
		final int CICLI = 4;
		for(int i =0 ; i<CICLI; i++) {
			somma += chiediNumero();
		}
		System.out.println("la somma dei 4 numeri interi e " + somma);
	}

	private static int chiediNumero() {
		
		System.out.println("inserisci un numero intero.");
		Scanner numero = new Scanner(System.in);
		
		return numero.nextInt();
	}



}
