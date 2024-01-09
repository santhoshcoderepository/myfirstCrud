package com.example.Crud.Crud.Person;

import java.util.List;

import com.example.Crud.Crud.Laptops.Laptops;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PesonDetails")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PesronID")
	private int id;
	
	@Column(name = "PesronName")
	private String pesonName;
	
	@Column(name = "Person Address")
	private String Address;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Laptops> lap;


	public Person() {
		super();
		
	}


	public Person(int id, String pesonName, String address, List<Laptops> lap) {
		super();
		this.id = id;
		this.pesonName = pesonName;
		this.Address = address;
		this.lap = lap;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPesonName() {
		return pesonName;
	}


	public void setPesonName(String pesonName) {
		this.pesonName = pesonName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		this.Address = address;
	}


	public List<Laptops> getLap() {
		return lap;
	}


	public void setLap(List<Laptops> lap) {
		this.lap = lap;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", pesonName=" + pesonName + ", Address=" + Address + ", lap=" + lap + "]";
	}
	
	
	
}
