package com.demo.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/employees")//No need, we can directly map using @GetMapping annotation
public class EmployeeController {

	@Autowired
	private EmployeeManager employeeDao;
	
 
 
	@GetMapping("/employees")
	public Employees getEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@PostMapping("/employees")
	 public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) { //You can generally add input JSON body using Postman 
		  
		   employeeDao.addEmployee(employee);
		   
		 return ResponseEntity.created(null).build();//the response will HTTP status code 201 indicating employee is created
	 }
		  
}
