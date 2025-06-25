package controller;

import java.util.ArrayList;
import java.util.List;

import model.Definizione;

public class DefCtrl {

	private List<Definizione> dizionario;

	public DefCtrl() {
		this.dizionario = new ArrayList();
	}
	public void add(Definizione def) {
		dizionario.add(def);
	}

	
}
