package control;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servers.PopService;
import servers.PopserviceImple;


@WebServlet("/regioni")
public class Regioni extends HttpServlet {
		private PopService service= new PopserviceImple();
		public Regioni() {
			// TODO Auto-generated constructor stub
			System.out.println("Server regioni creata");
		}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("ho chiamato il metodo Get");
		//	res.getWriter().print("ho chiamato il metodo Get");
			req.setAttribute("Titolo", "la mia pagina è figa");
			req.setAttribute("regioni",service.getRegione());
			req.getRequestDispatcher("regions.jsp").forward(req, res);
		}
	
	
	
	
	
}
