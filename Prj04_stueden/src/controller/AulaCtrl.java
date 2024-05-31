package controller;

import java.util.ArrayList;
import model.Studenti;
public class AulaCtrl {
	
	private ArrayList<Studenti> studenti;
	
	public AulaCtrl() {
		// TODO Auto-generated constructor stub
		this.studenti = new ArrayList<Studenti>();
		
	}
	public void addStudenti(Studenti s) {
		this.studenti.add(s);
	}
	public ArrayList<Studenti> getStudenti() {
		return studenti;
		
	}
}
