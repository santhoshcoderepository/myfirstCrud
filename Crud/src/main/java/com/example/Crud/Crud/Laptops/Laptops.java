package com.example.Crud.Crud.Laptops;


import com.example.Crud.Crud.Person.Person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LaptopDetails")
public class Laptops {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LaptopID")
    private int lapID;
	
	@Column(name = "LaptopName")
    private String lapName;
	
	@Column(name = "LaptopMOdel")
    private String lapModel;
	
	@Column(name = "LaptopPrice")
    private long laptopPrice;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  private Person p;

	public Laptops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLapID() {
		return lapID;
	}

	public void setLapID(int lapID) {
		this.lapID = lapID;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public String getLapModel() {
		return lapModel;
	}

	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}

	public long getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(long laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public Laptops(int lapID, String lapName, String lapModel, long laptopPrice) {
		super();
		this.lapID = lapID;
		this.lapName = lapName;
		this.lapModel = lapModel;
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptops [lapID=" + lapID + ", lapName=" + lapName + ", lapModel=" + lapModel + ", laptopPrice="
				+ laptopPrice + ", p=" + p + "]";
	}
	
	
	
    
}
