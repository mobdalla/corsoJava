package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.User;

public class UserDAO {
		private Connessione conn = new Connessione();
		private Statement myconn;
		private ResultSet rs;
		public ArrayList<User> getUsr() {
			ArrayList<User> Users = new ArrayList<User>();
			
			try {
				myconn = (Statement) conn.Connetti().createStatement();
				rs = myconn.executeQuery("SELECT * FROM user");
				while(rs.next()) {
					User u = new User();	
					u.setId(rs.getInt("id_user"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					Users.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Users;
		}
		
}
