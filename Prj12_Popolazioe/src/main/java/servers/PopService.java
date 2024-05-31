package servers;

import java.util.List;

import entities.Provincia;

public interface PopService {
	
	List<String> getRegione();
	List<Provincia> getProvinciaByRegione(String regione);
	Provincia  getProvinciaById(int id);
	
	
	
}
