package org.ass.calculator.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_info")
public class Product implements Serializable{
	
	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String productName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="foreign_key")
	private List<Brand> brand;
	

	public List<Brand> getBrand() {
		return brand;
	}

	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
}
