package com.example.ktrusilo.zad07.domain;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@NamedQueries({
        @NamedQuery(name = "owner.getAll", query = "Select o from Owner o"),
        @NamedQuery(name = "owner.deleteAll", query="Delete from Owner "),
        @NamedQuery(name="owner.getById", query="Select o from Owner o where o.id=:id"),
})
public class Owner {
	
	private int id;
	private String firstname;
	private String lastname;
	private List<Wardrobe> wardrobe = new ArrayList<>();
		

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToMany(fetch=FetchType.EAGER,mappedBy="owner")
	@JsonIgnoreProperties("owner")
	public List<Wardrobe> getWardrobe() {
		return wardrobe;
	}
	
	@JsonProperty
	public void setWardrobe(List<Wardrobe> wardrobe) {
		this.wardrobe = wardrobe;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
