package com.example.restwsdemo.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wardrobe {
	
	private String name;
	private Date productionDate;
	private double weight;
	private boolean isWood;
	
	
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


	
	public Wardrobe(String name, Date productionDate, double weight, boolean isWood) {
		super();
		this.name = name;
		this.productionDate = productionDate;
		this.weight = weight;
		this.isWood = isWood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isWood ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wardrobe other = (Wardrobe) obj;
		if (isWood != other.isWood)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	
}
