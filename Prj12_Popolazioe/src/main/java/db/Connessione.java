package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
		private final String URL="jdbc::mariadb://localhost:3306/java";
		private final String USER="root";
		private final String PASS="";
		private Connection conn;
		public Connection Conntti() {
			try {
				conn=DriverManager.getConnection(URL,USER,PASS);
				System.out.println("sei connesso al db");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("non sei connesso: "+e.getMessage());
			}
			return conn;
			
		}
		
		
		
}
