package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.Provincia;

public class ProvinciaDAO {
		private Connessione conn = new Connessione();
		private Statement mycon;
		private ResultSet rs;
		public ArrayList<Provincia> getProvince(){
			ArrayList<Provincia> province = new ArrayList<>();
			try {
				mycon=(Statement) conn.Conntti().createStatement();
				rs = mycon.executeQuery("SELECT * FROM regione");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return province;
			
		}
}
