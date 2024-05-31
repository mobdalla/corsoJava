package db;

import java.sql.Connection;
import java.util.ArrayList;

import model.User;

public class Provaconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connessione con = new  Connessione();
		con.Connetti();
		UserDAO dao = new UserDAO();
		ArrayList<User> users =dao.getUsr();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
