package org.ass.calculator.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class City implements Serializable{

	private String cityName;
	
	private int pinCode;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
