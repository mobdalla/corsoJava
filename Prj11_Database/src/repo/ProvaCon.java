package repo;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

import model.TodoDAO;

public class ProvaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conessione mycon = new Conessione();
		mycon.getConn();
		TodoDAO dao = new TodoDAO();
		File f = new File("W:\\SWD_23-25\\comune\\pokemon.csv");
		try {
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				String riga = s.nextLine();
				
				String[] split = riga.split(",");
				//System.out.println(riga);
				if(!riga.startsWith("#")) {
					System.out.println(split[1]);
					dao.addToDo(split[1],LocalDate.now(),true);

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
