package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private String URL ="jdbc::mariadb://localhost:3306/java";
	private String USER ="root";
	private String PASS ="";
	private Connection conn =null ;
	public void connetti() {
		
		try {
			conn = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("create connessione");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("non sei connesso "+e.getMessage());
		}
		
	}
	
	
	
}
