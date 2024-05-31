package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conessione {
	private final String URL="jdbc:mariadb:://localhost:3306/java";
	private final String USER="root";
	private final String PASS="";
	private Connection conn;
	private void connetti() {
		try {
			conn=DriverManager.getConnection(URL,USER,PASS);
			System.out.println("sei connesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("non sei connesso "+ e.getMessage());
		}
	}
	public Connection getConn() {
		if(conn==null) {
			connetti();
		}
		else {
			
		}
		return conn;
	}
	
}
