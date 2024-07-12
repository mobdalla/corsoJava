package com.musty.interfaccia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class ComparatoreTitoloLibri implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro L1, Libro L2) {
//		// TODO Auto-generated method stub
//		return L1.titolo.compareTo(L2.titolo);
//	}
//	
//}
public class InterfaccciaDemo {

	public static void main(String[] args) {
//		
//		ProvaZero pz = new ProvaZero();
//		ZeroMethod pz2 = new ProvaZero();
//		contratto c1 = new contrattoImp();
//		c1.regola1();
	//	contratto cc = () -> System.out.println("pippo");
		Libro l1 = new Libro();
		l1.titolo ="io robot";
		l1.pagine = 123;
		Libro l2 = new Libro();
		l2.titolo ="zanna bianca";
		l2.pagine = 103;
		Libro l3 = new Libro();
		l3.titolo ="baciami piccina";
		l3.pagine = 1233;
		
		List<Libro> libri = new ArrayList<>(List.of(l1,l2,l3));
		///ComparatoreTitoloLibri ctl = new ComparatoreTitoloLibri();
//		Comparator<Libro> ctr = new Comparator<>() {
//			
//			@Override
//			public int compare(Libro o1, Libro o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
	//	Collections.sort(libri, (li1,li2) -> l1.titolo.compareTo(l2.titolo)); //(ll1, ll2)-> ll1.titolo.compareTo(ll2.titolo));
		libri.stream()
		.filter(l -> l.pagine >500)
		.sorted((ll1,ll2)-> ll1.titolo.compareTo(ll2.titolo))
		.forEach(l -> System.out.println(l.titolo));
//		for (Libro libro : libri) {
//			System.out.println(libro.titolo);
//		}
		
		
	}
}
