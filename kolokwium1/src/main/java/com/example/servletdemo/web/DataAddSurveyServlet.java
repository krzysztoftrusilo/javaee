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

import com.example.servletdemo.domain.Survey;
import com.example.servletdemo.service.SurveyService;

@WebServlet(urlPatterns = "/data-survey")
public class DataAddSurveyServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SurveyService ss = (SurveyService) getServletContext().getAttribute("survey_service");
		
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

		Date from = null;
		try {
			from = formatter.parse(request.getParameter("from"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date to = null;
		try {
			to = formatter.parse(request.getParameter("to"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String frequency = String.parseString(request.getParameter("frequency"));
		boolean isAttention = Boolean.parseBoolean(request.getParameter("isattention"));

		Survey newSurvey = new Survey(from, to, frequency, isAttention);

		ss.addToDatabase(newSurvey);
		response.sendRedirect("all-surveys");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("survey_service", new SurveyService());
	}

}
