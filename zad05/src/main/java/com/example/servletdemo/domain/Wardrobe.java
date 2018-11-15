package com.example.servletdemo.domain;

import java.util.Date;

public class Wardrobe {
	
	private long id;
	private String name;
	private Date productionDate;
	private double weight;
	private boolean isWood;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isWood() {
		return isWood;
	}
	public void setWood(boolean isWood) {
		this.isWood = isWood;
	}
	public Wardrobe(long id, String name, Date productionDate, double weight, boolean isWood) {
		super();
		this.id = id;
		this.name = name;
		this.productionDate = productionDate;
		this.weight = weight;
		this.isWood = isWood;
	}
	public Wardrobe() {
		super();
	}

}
