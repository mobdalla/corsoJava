
package controller;

import java.util.ArrayList;
import java.util.List;

import database.FilmDAO;
import model.Film;

public class FilmCtrl {
	FilmDAO dao = new FilmDAO();
	public ArrayList<Film> getFilms(){
		return dao.getFilm();
		
		}
	public ArrayList<Film> getFilmsByGenre(int genreId){
		ArrayList<Film> filmByGenre = new ArrayList<>();
		for (Film f : dao.getFilm()) {
			if(f.getGenreId()==genreId) {
				filmByGenre.add(f);
			}
		}
		return filmByGenre;
//		
	//	return dao.getFilm().stream().filter(film -> film.getGenreId()==genreId).toList();
		}
	}
