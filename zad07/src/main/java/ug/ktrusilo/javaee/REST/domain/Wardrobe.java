package ug.ktrusilo.javaee.REST.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@NamedQuery(name="processor.all", query="select p from Processor p")
public class Wardrobe {

	private long id;
	private String name;
	private int doors;
	private double weight;
	private Date productionDate;
	public Wardrobe()
	{
		super();
	}
	
	
	public Wardrobe(long id, String name, int doors, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.doors = doors;
		this.weight = weight;
	}


	public Wardrobe(String name, int doors, double weight) {
		super();
		this.name = name;
		this.doors = doors;
		this.weight = weight;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd")
	public Date getproductionDate() {
		return productionDate;
	}

	public void setproductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
}
