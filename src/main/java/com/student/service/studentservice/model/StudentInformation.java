package com.student.service.studentservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studentlist")

public class StudentInformation {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int rollno;
	 	
	 	private String name;
	 	
	 	private String email;
		   
	    // Mapping to the other table
	    // @OneToMany(mappedBy="studentInformation", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval=true)
//	 	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval=true)
//	    @JoinColumn(name = "rollno")
	     @OneToMany(cascade = CascadeType.ALL)
	     @JoinColumn(name = "rollno",nullable = false, updatable = false)
	    private List<StudentAddress> studentAddress  ;
          

		@Override
		public String toString() {
			return "StudentInformation [rollno=" + rollno + ", name=" + name + ", email=" + email + ", studentAddress="
					+ studentAddress + "]";
		}
		
		public StudentInformation() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentInformation(int rollno, String name, String email, List<StudentAddress> studentAddress) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.email = email;
			this.studentAddress = studentAddress;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public List<StudentAddress> getStudentAddress() {
			return studentAddress;
		}


		public void setStudentAddress(List<StudentAddress> studentAddress) {
			this.studentAddress = studentAddress;
		}


		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		

		
}
