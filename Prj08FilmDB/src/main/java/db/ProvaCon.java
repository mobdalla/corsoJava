package db;

import java.util.ArrayList;

import model.Film;

public class ProvaCon {

	public static void main(String[] args) {
		Connessione  conn = new Connessione();
		conn.getConn();
		FilmDAO dao = new FilmDAO();
		
		ArrayList<Film> films = dao.getFilms();
//		for(int i = 0; i < films.size(); i++) {
//			System.out.println(films.get(i));
//		}
		for (Film film : films) {
			System.out.println(film);
		}
		
	}
}
