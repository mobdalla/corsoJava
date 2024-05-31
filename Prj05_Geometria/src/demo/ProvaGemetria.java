package demo;
import java.util.ArrayList;

import model.*;

public class ProvaGemetria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Porgramma Geometria Piana");
		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		Segamento ab =  new Segamento(a,b);
		Segamento ac =  new Segamento(a,c);
		Segamento bc =  new Segamento(b,c);
		
		Figura t = new Triangolo(a, b, c);
		//System.out.println(t);
		Figura r = new Rettangolo(ab, ac);
	
		//Rettangolo q = new Quadrato(ab);
		Figura q = new Quadrato(ab);
	
		
		ArrayList<Figura> figure = new ArrayList<Figura>();
		
		figure.add(t);
		figure.add(r);
		figure.add(q);
			for (Figura figura : figure) {
				if(figura instanceof Quadrato) {
					System.out.println("è un quadrato !!!");
					((Quadrato)figura).area();			
				}
				System.out.println(figura);
			}
		
//		System.out.println(ab);
//		System.out.println(ac);
//		System.out.println(bc);
//		System.out.println("il valore di x: "+ a.getX());
//		System.out.println("il valore di y: "+ a.getY());
//		//a.setY(7);
//		System.out.println("il valore di y: "+ a.getY());
//		System.out.println(a);
//		System.out.println(b);
	}

}
