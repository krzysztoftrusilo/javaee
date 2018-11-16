package com.example.servletdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletdemo.domain.Survey;

public class SurveyService {
	
	private List<Survey> db = new ArrayList<Survey>();
	
	public void addToDatabase(Survey survey) {
		Survey newSurvey = new Survey(survey.getFrom(), survey.getTo(), survey.getFrequency(), survey.getAttention());
		db.add(newSurvey);
	}
	
	public List<Survey> getAllSurveys() {
		return db;
	}

}
