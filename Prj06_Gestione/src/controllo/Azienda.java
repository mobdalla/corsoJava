package controllo;

import java.util.ArrayList;
import model.*;

public class Azienda {

	private String nome;
	private ArrayList<Dipendente> model;
	public Azienda(String nome) {
	
		this.model = new ArrayList<>();
		this.nome = nome;
	}
	public void addDipendente (String nome, String cognome , String ruolo) {
		switch (ruolo) {
			case "I": 
				Impiegato  e = new Impiegato(nome, cognome);
				e.setOrelav(100);
				model.add(e);
				break;
			case "F": 
				Fattorino  ef = new Fattorino(nome, cognome);
				ef.setNumC(200);
				model.add(ef);
			break;
			case "D": 
				Dirigente  ef2 = new Dirigente(nome, cognome);
				ef2.setDipendAsse(1799);
				model.add(ef2);
			break;
		
		
		default:
			break;
		}
	}
	public ArrayList<Dipendente> getDipendente() {
		
		return model;
	}
	public ArrayList<Dipendente> getFattorini(){
		ArrayList<Fattorino> Fattorini = new ArrayList<>();
		for (Dipendente d : model) {
			if(d instanceof Fattorino)
				Fattorini.add((Fattorino) d);
			
			
		}
		return model;
	}
}
