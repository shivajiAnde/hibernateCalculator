package org.ass.calculator.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="user")
public class UserEntity  implements Serializable{
	
	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="altkey")
	private int altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="contact_number")
	private String contactnumber;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String  country;
	
	@Column(name="pin_code")
	private String pincode;

	public int getAltkey() {
		return altkey;
	}

	public void setAltkey(int i) {
		this.altkey = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserEntity [altkey=" + altkey + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactnumber=" + contactnumber + ", city=" + city + ", country=" + country + ", pincode="
				+ pincode + "]";
	}


}
