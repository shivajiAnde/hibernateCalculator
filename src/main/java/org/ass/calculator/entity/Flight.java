package org.ass.calculator.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="flight_info")
public class Flight implements Serializable{

	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private int altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
	@Column(name="price")
	private Double price;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foreign_key")
	private List<AirHosters> airhosters;

	
	public int getAltkey() {
		return altkey;
	}

	public void setAltkey(int altkey) {
		this.altkey = altkey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<AirHosters> getAirhosters() {
		return airhosters;
	}

	public void setAirhosters(List<AirHosters> airhosters) {
		this.airhosters = airhosters;
	} 
	
}
