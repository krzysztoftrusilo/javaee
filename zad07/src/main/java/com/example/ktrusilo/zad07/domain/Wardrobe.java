package com.example.ktrusilo.zad07.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = "wardrobe.getAll", query = "Select w from Wardrobe w"),
        @NamedQuery(name = "wardrobe.deleteAll", query="Delete from Wardrobe "),
        @NamedQuery(name = "wardrobe.getByNumber", query="Select w from Wardrobe w where w.id=:id"),
        @NamedQuery(name = "wardrobe.getByOwner", query="Select w.owner from Wardrobe w where w.id=:id"),
        @NamedQuery(name = "wardrobe.Owner", query="Select o from Owner o")
})
public class Wardrobe {
	
	private int id;
	private String name;
	private Date dateProduction;
	private boolean iswood;
	private double weight;
    private Producer producer;
    private Number number;
    private List<Owner> owner = new ArrayList<>();
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
    @ManyToOne(fetch = FetchType.EAGER) //
	@JoinColumn(name = "producer_id", nullable = false)
	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "number_id", unique=true)
	public Number getNumber() {
		return number;
	}
	
	public void setNumber(Number number) {
		this.number = number;
	}
	
	@ManyToMany(fetch=FetchType.EAGER) //
	@JsonIgnoreProperties({"wardrobe"})
	public List<Owner> getOwner() {
		return owner;
	}
	
	@JsonProperty
	public void setOwner(List<Owner> owner) {
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateProduction() {
		return dateProduction;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}

	public boolean isIswood() {
		return iswood;
	}

	public void setIswood(boolean iswood) {
		this.iswood = iswood;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
