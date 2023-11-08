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
@Table(name="brand_info")
public class Brand implements Serializable{
	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="id")
	private int id;
	
	@Column(name="brand")
	private String brand;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="foreign_key")
	List<Product> product;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
