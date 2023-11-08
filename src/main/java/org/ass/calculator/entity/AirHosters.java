package org.ass.calculator.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="airHosters_info")
public class AirHosters implements Serializable{
	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private int altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
