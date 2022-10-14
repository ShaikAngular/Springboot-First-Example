package com.student.service.studentservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student_address")
public class StudentAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String cityname;
	
	private String street;
	
	private String state;
	
	private String country;
	
	// Mapping the column of this table 
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    //Adding the name
    @JoinColumn(name = "rollno", nullable=false, insertable=false ,updatable=false)
    private StudentInformation studentInformation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public StudentInformation getStudentInformation() {
		return studentInformation;
	}

	public void setStudentInformation(StudentInformation studentInformation) {
		this.studentInformation = studentInformation;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	@Override
	public String toString() {
		return "StudentAddress [id=" + id + ", cityname=" + cityname + ", street=" + street + ", state=" + state
				+ ", country=" + country + ", studentInformation=" + studentInformation + "]";
	}
	
	

	public StudentAddress(int id, String cityname, String street, String state, String country,
			StudentInformation studentInformation) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.street = street;
		this.state = state;
		this.country = country;
		this.studentInformation = studentInformation;
	}

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	
        
    

}
