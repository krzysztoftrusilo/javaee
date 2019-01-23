package com.example.servletdemo.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sock {
	public static int licznik = 0;
    private long id = 0;
    private String name = "-";
    private boolean isToes = true;
    private boolean isPlain = true;
    private double price = 00.00;
    private Date productionDate = new Date();

    public Sock(String name, boolean isToes, boolean isPlain, double price, Date productionDate) {
        this.id = licznik++;
        this.name = name;
        this.isToes = isToes;
        this.isPlain = isPlain;
        this.price = price;
        this.productionDate = productionDate;
    }

    public Sock() {

    }

    public String showDetails() {
        String toes;
        if(isToes) {
            toes = "Yes";
        }
        else {
            toes = "No";
        }
        
        String pattern;
        if(isPlain) {
        	pattern = "Yes";
        }
        else {
        	pattern = "No";
        }
        
        SimpleDateFormat df = new SimpleDateFormat ("dd-MM-yyyy");
        return "Name: " + name + "<br>Is with toes: " + toes +"<br>Is plain: " + pattern + "<br>Price: " + price + "<br>Production Date: " + df.format(productionDate);
    }

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

	public boolean isToes() {
		return isToes;
	}

	public void setToes(boolean isToes) {
		this.isToes = isToes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public boolean isPlain() {
		return isPlain;
	}

	public void setPlain(boolean isPlain) {
		this.isPlain = isPlain;
	}

}
