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

import com.example.servletdemo.domain.Survey;
import com.example.servletdemo.service.SurveyService;

@WebServlet(urlPatterns = "/all-surveys")
public class AllSurveysServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SurveyService ss = (SurveyService) getServletContext().getAttribute("survey_service");
	
		List<Survey> allWardrobes = ss.getAllSurveys();

		out.append("<html><body><h2>All wardrobes:</h2>");

		for (Survey survey: allSurveys) {
			out.append("<p>From: " + survey.getFrom() + "</p>");
			out.append("<p>To: " + survey.getTo() + "</p>");
			out.append("<p>Weight: " + survey.getFrequency() + "</p>");
			out.append("<p>Wooden: " + survey.isAttention() + "</p>");
		}

		out.append( "</br><li><a href='index'>Index</a></li>");
		out.append("</body></html>");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("survey_service", new SurveyService());
	}
}
