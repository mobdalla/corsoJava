package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import controller.FilmCtrl;
import model.Film;

public class Noleggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilmCtrl controller = new FilmCtrl();
	//	controller.getFilms();
		File miofile = new File("C:\\Users\\ICTS23-25.448\\Desktop\\film.html");
		try {
			PrintWriter output = new PrintWriter(miofile);
			output.println("<table>");
			output.println("<tr>");
			output.println("<th>Film</th>");
			output.println("<th>Anno di pubblicazione</th>");
			output.println("</tr>");
			for (Film f : controller.getFilmsByGenre( 3)) {
				//System.out.println(f);
				output.println("<tr>");
				output.println("<td>"+f.getTitle()+"</td>");
				output.println("<td>"+f.getRelease_year()+"</td>");
				output.println("</tr>");
			}
			output.println("</table>");
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
