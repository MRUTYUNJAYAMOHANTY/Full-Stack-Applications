// Employee.java file is a JPA entity or simply a POJO class  representing data 
// that can be persisted in the database

package com.java.angular.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Annotations to map Employee model to relational database table 
@Entity
@Table(name = "employees")

public class Employee {
	
//	data types with field names
	
//	primary key for table
	@Id
//	primary key generation strategy
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
//	to provide column name to field
//	we can map a column name to the field and also we can give a column name here
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id")
	private String emailId;
	
//	if we are using parameterized constructor then its compulsory to 
//	use default constructor.because hibernate internally uses proxies to create proxy objects
	public Employee() {
		
	}
	
//	parameterized constructor
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
//	getter and setter used for encapsulation 
//	to provide controlled access to an object's fields (variables) 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
