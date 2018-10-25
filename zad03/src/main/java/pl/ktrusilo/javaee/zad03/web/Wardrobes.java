package pl.ktrusilo.javaee.zad03.web;

import pl.ktrusilo.javaee.zad03.domain.Wardrobe;
import pl.ktrusilo.javaee.zad03.service.StorageService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/wardrobes")
public class Wardrobes extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");

		List<Wardrobe> allWardrobes = ss.getAllWardrobes();

		out.append("<html><body><h2>All Wardrobes:</h2>");

		for (Wardrobe wardrobe: allWardrobes) {
			out.append("<p>Name: " + wardrobe.getName() + "</p>");
			out.append("<p>Production date: " + wardrobe.getProductionDate() + "</p>");
			out.append("<p>Weight: " + wardrobe.getWeight() + "</p>");
			out.append("<p>Is wood: " + wardrobe.isWoodStatus() + "</p><br>");
		}

		out.append("</body></html>");
		out.close();
	}

	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}
