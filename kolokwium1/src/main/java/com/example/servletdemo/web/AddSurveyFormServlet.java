package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletdemo.domain.Survey;
import com.example.servletdemo.service.SurveyService;

@WebServlet(urlPatterns = "/add-survey")
public class AddSurveyFormServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SurveyService ss = (SurveyService) getServletContext().getAttribute("survley_service");
		
		int size = ss.getAllSurveys().size() +1;
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Fill a survey</h2>" +
				"<form action='data-survey'>" +
				"From: <input type='date' name='productionDate' /> <br />" +
				"To: <input type='date' name='productionDate' /> <br />" +
				"Frequency: " +
				  "<input type='radio' name='frequency' value='daily'> Daily<br>" +
				  "<input type='radio' name='frequency' value='weekly'> Weekly<br>" +
				  "<input type='radio' name='frequency' value='monthly'> Monthly" +
				"Attention: <select name='isAttention'>" +
				"<option value='true'>Yes</option>" +
				"<option value='false'>No</option>" +
				"</select><br />" +
				"<input type='submit' name='add' value=' OK ' /></form>" +
				"</body></html>");
		out.close();
	}
	
}
