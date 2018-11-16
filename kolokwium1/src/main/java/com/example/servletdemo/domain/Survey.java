package com.example.servletdemo.domain;

import java.util.Date;

public class Survey {

	private Date from;
	private Date to;
	private String frequency;
	private String attention;
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getAttention() {
		return attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}
	public Survey(Date from, Date to, String frequency, String attention) {
		super();
		this.from = from;
		this.to = to;
		this.frequency = frequency;
		this.attention = attention;
	}
	public Survey() {
		super();
	}

		
}
