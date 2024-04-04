package com.demo.ems;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

	private Employees list= new Employees();
	
	public EmployeeManager() {
		//adding employee details!
		 list.getEmployeeList().add(new Employee(1, "Nandini", "sharma", "nandini1472@gmail.com", "product Manager" ));  
		 list.getEmployeeList().add(new Employee(2, "suresh", "patel", "sureshpatel2@gmail.com", "Associate Engineer"));
		 list.getEmployeeList().add(new Employee(3, "Arjun", "Mehta", "arjunmehta@gmail.com", "senior software developer"));
		 
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmployee(Employee employee) {
		
 
		Integer id = getAllEmployees().getEmployeeList().size() + 1; 
        
		   employee.setId(id);//setting Id for the added employee
		   
		list.getEmployeeList().add(employee);
	}
	
}
