package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.mariadb.jdbc.Statement;

import model.Film;
public class FilmDAO {
	private Connessione miaCon = new Connessione();
	private Statement istruzione;
	private ResultSet rs;
	public ArrayList<Film> getFilms(){
		ArrayList<Film> films =  new ArrayList<Film>();
		try {
			istruzione = (Statement) this.miaCon.getConn().createStatement();
			rs=istruzione.executeQuery("SELECT * FROM film");
			while(rs.next()) {
				Film f = new Film();
				f.setTitolo(rs.getString("titolo"));
				f.setRegista(rs.getString("regista"));
			
				f.setId(rs.getInt("id"));
				f.setRating(rs.getInt("rating"));
				films.add(f);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return films;
		
		
	}
}
