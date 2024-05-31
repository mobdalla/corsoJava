package base;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] voti = {25,21,24,18};
		for (int i = 0; i < voti.length; i++) {
			//prendi il valore di i e di i+1
			//confront il valore e se sono ordine lascia
			//altrimenti fai swap (i, i+1)
			
		
		}
		Arrays.sort(voti);
		for (int i = 0; i < voti.length; i++) {
			System.out.println(voti[i]);
		}
		System.out.println("------------------");
		for( int voto : voti) {
			System.out.println(voto);
		}
		
		
	
	}
	private static int[] swap(int[] a) {
		
		// int[] scambiati = new int[2];
		int temp = a[1];
		a[1] = a[0];
		a[0]= temp;
		return a;
	}

}
