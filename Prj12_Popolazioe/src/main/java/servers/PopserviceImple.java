package servers;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import entities.Provincia;

public class PopserviceImple implements PopService {

	@Override
	public List<String> getRegione() {
		 String[] reg = {"Piemonte", "lombardia","lazio"};	
		 
		return Arrays.asList(reg);
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String regione) {
		
		Provincia p1 = new Provincia();
		Provincia p2 = new Provincia();
		p1.setComune("Torino");	
		p2.setComune("Asti");	
		return List.of(p1,p2);
	}

	@Override
	public Provincia getProvinciaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
