package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import repo.Conessione;

public class TodoDAO {
	private Conessione connessi = new Conessione();
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public void addToDo(String descrizione, LocalDate data, boolean done) {
		try {
			pst= connessi.getConn().prepareStatement("insert into todo (descrizione, data, done) values(?,?,?)");
			//String query="INSERT INTO todo (descrizione) VALUEs ('intervallo')";
			pst.setString(1, descrizione);
			//st.execute(query);
			pst.setBoolean(3, done);
			pst.setDate(2, Date.valueOf(data));
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
