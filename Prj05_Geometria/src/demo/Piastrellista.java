package demo;

import java.util.ArrayList;

import model.Punto;
import model.Figura;
import model.Quadrato;
import model.Segamento;
import model.Rettangolo;
public class Piastrellista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> stanze = new ArrayList<Figura>();
		
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(5,0);
		Punto p3 = new Punto(7,0);
		
		Quadrato cucina = new Quadrato(new Segamento(p1, p2));
		Quadrato bagno = new Quadrato(new Segamento(p2, p3));
		Rettangolo camera = new Rettangolo(new Segamento(p1, p2),new Segamento(p1, p3));
		
		Rettangolo camera2 = new Rettangolo(new Segamento(p1, p2),new Segamento(p1, p3));
		stanze.add(cucina);
		stanze.add(bagno);
		stanze.add(camera);
		stanze.add(camera2);
		double superficie = 0;
		for (Figura stanza : stanze) {
			superficie += stanza.area();
		}
		System.out.println("la superficie dell appartmento");
		System.out.println(superficie);
		double superficiePiastrella = 0.25;
		double numPias = superficie / superficiePiastrella;
		System.out.println("il n.ro di piastrelle: "+ numPias);
		}

}
