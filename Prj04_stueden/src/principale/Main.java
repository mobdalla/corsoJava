package principale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import model.Studenti;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("files/studenti.txt");
		File des = new File("files/studenti2.html");
		try {
			Scanner input = new Scanner(f);
			PrintWriter penne  = new PrintWriter(des);
			penne.println("<h1>Studenti</>");
			penne.println("<ul>");
			while (input.hasNextLine()) {
				String riga = input.nextLine();
				String[] parole = riga.split(",");
				String nome = parole [0];
				String cognome = parole [1];
				Studenti s = new Studenti(nome, cognome);
				penne.println("<li>"+ s.getCognome() + "</li>");
				//System.out.println(s);
			}
			penne.println("</ul>");
			penne.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Mi dispiace il file non è raggiungnibile");
			System.err.println(e.getMessage());
		}
	}

}
