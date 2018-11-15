package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletdemo.domain.Wardrobe;
import com.example.servletdemo.service.StorageService;

@WebServlet(urlPatterns = "/cart")
public class CartServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		if(session.getAttribute("rodo") == "off") 
        response.sendRedirect("");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
		
		List<Wardrobe> allWardrobes = ss.getShoppingCart();

		out.append("<html><body><h2>Your cart:</h2>");

		for (Wardrobe wardrobe: allWardrobes) {
			out.append("<p>Id: " + wardrobe.getId() + "</p>");
			out.append("<p>Name: " + wardrobe.getName() + "</p>");
			out.append("<p>Production date: " + wardrobe.getProductionDate() + "</p>");
			out.append("<p>Weight: " + wardrobe.getWeight() + "</p>");
			out.append("<p>Wooden: " + wardrobe.isWood() + "</p></br>");
		}

		out.append("</br><li><a href='index'>Index</a></li>");
		out.append("</body></html>");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}