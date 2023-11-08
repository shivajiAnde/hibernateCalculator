package org.ass.calculator.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="table_info")
public class Team implements Serializable{
	@Id
	@GenericGenerator(name="auto_gen",strategy= "increment")
	@GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private int altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="team_size")
	private String teamSize;
	
	@Column(name="team_type")
	private String teamType; 
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name= "foreign_key")
	private Captain captain;

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

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	
}
