package main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import controller.LibroCtrl;
import model.Libro;

//class ComparaTorePrezzo implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro o1, Libro o2) {
//		// TODO Auto-generated method stub
//		return Double.compare(o1.getPrezzo(), o2.getPrezzo());
//	}
//	
//}

public class DemoLibri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/refs/heads/master/tabelle/libri/Biblioteca.csv");
		URLConnection flusso = url.openConnection();
		LibroCtrl ctrl = new LibroCtrl();
		Random rand = new Random();
		//BufferedReader br = new BufferedReader(flusso);
		Scanner sc = new Scanner(new InputStreamReader(flusso.getInputStream()));
		while(sc.hasNextLine()) {
			String riga = sc.nextLine();
			String[] split = riga.split(",");
			String titolo = split[2];
			Libro temp = new Libro();
			temp.setTitolo(titolo);
			temp.setPagine(rand.nextInt(50,100));
			temp.setPrezzo(rand.nextDouble(10,20));
			
			
			
			ctrl.addLibro(temp);
			//System.out.println(split[2]);
		}
//		Libro l1 = new Libro(1,"Zotto",10,100);
//		Libro l2 = new Libro(2,"Anna voi capelli",15,50);
//		Libro l3 = new Libro(3,"Marcovaldo",5,150);
//		
//		LibroCtrl ctrl = new LibroCtrl();
//		
//		ctrl.addLibro(l1);
//		ctrl.addLibro(l3);
//		ctrl.addLibro(l2);
//		for (int i = 0 ; i < ctrl.getLibro().size(); i++) {
//			System.out.println(ctrl.getLibro().get(i));
//		}
//		
//		Comparator<Libro> cp = (Libro o1, Libro o2) -> Double.compare(o1.getPrezzo(), o2.getPrezzo());
		
		
		//Collections.sort(ctrl.getLibro(), cp);
		List<String> list = ctrl
			.getLibro()
			.stream()
			.filter(l-> l.getPrezzo() > 9)
			.sorted((Libro o1, Libro o2) -> Double.compare(o1.getPrezzo(), o2.getPrezzo()))
	//		.forEach(libro -> System.out.println(libro));
			.sorted()
			.map(l->l.getTitolo())
		//	.filter(l->l.length() < 10)
			.toList();
		
		//	.forEach(System.out::println);
		
		PrintWriter printer = new PrintWriter(new File("C:\\Users\\ICTS23-25.448\\Desktop\\libri.txt"));
		list.forEach(printer::println);
	}

}
