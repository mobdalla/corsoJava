package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL ="jdbc:mariadb://localhost:3306/test";
	private final String USER ="root";
	private final String PASS ="";
	private Connection Conn = null;
	public Connection Connetti() {
		try {
			Conn = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("sei connesso al db");
		} catch (SQLException e) {
			
			System.err.println("Non connesso"+e.getMessage());
		}
		return Conn;
	}
	
	
}
