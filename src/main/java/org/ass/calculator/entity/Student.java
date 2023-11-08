package org.ass.calculator.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Student implements Serializable{

	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator="auto_gen")
	private int alt_key;
	
	private String name;
	
	private int marks;
	
	private City city;

	public int getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(int alt_key) {
		this.alt_key = alt_key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [alt_key=" + alt_key + ", name=" + name + ", marks=" + marks + "]";
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
