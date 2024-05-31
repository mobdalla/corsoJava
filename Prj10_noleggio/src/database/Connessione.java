package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL="jdbc:mariadb://localhost:3306/video_store_database";
	private final String USER="root";
	private final String PASS="";
	
	
	private Connection conn;
	
	public void connetti(){
		try {
			this.conn=DriverManager.getConnection(URL,USER , PASS);
			System.out.println("sei connesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connessione non riuscita :"+e.getMessage());
		}
	}

	public Connection getConn() {
		return conn;
	}
	
}
