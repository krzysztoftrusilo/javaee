package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletdemo.domain.Wardrobe;
import com.example.servletdemo.service.StorageService;

@WebServlet(urlPatterns = "/data-wardrobe")
public class DataAddWardrobeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
		
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		long id = Long.parseLong(request.getParameter("id"));
		String name = request.getParameter("name");
		Date productionDate = null;
		try {
			productionDate = formatter.parse(request.getParameter("productionDate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		double weight = Double.parseDouble(request.getParameter("weight"));
		boolean isWood = Boolean.parseBoolean(request.getParameter("isWood"));

		Wardrobe newWardrobe = new Wardrobe(id, name, productionDate, weight, isWood);

		ss.addToDatabase(newWardrobe);
		response.sendRedirect("all-wardrobes");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}