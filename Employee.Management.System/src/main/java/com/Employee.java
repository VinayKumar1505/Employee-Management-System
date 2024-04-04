package com.demo.ems;

public class Employee {

	private int id;
	 
	private String firstName;
	private String secondName;
	private String email;
	private String title;
	
	public Employee(int id, String firstName, String secondName, String email, String title) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
		this.title = title;
	}

	public Employee(Employee newEmployee) {
		// TODO Auto-generated constructor stub
	}

 

	public int getId() { 
		return id;
	}
	
	 

	public void setId(int id) {
		this.id = id;
	}
	 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", email=" + email
				+ ", title=" + title + "]";
	}
	
	
	
	
	
	
	
	
	 
	
}
