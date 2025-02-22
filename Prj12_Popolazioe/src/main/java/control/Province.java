package control;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servers.PopService;
import servers.PopserviceImple;
import entities.Provincia;

@WebServlet("/province")
public class Province extends HttpServlet {
		private PopService service= new PopserviceImple();
		public Province() {
			// TODO Auto-generated constructor stub
			System.out.println("Server province creata");
		}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("ho chiamato il metodo Get");
			String regione= req.getParameter("regione");
			List<Provincia>  provinceByRegione = service.getProvinciaByRegione(regione);
			req.setAttribute("titolo", regione);
			req.setAttribute("provinces", provinceByRegione);
			//res.getWriter().print("le provinece della regione :"+regione);
			req.getRequestDispatcher("provinca.jsp").forward(req, res);
		}
	
	
	
	
	
}
