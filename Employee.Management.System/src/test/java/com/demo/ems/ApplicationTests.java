package com.demo.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class ApplicationTest {

    @InjectMocks
    EmployeeController employeeController;

    @Mock
    EmployeeManager employeeManager;

   

    @Test
    void testGetEmployees() {
        // Prepare data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Nandini", "sharma", "nandini1472@gmail.com", "product Manager"));
        employees.add(new Employee(2, "suresh", "patel", "sureshpatel2@gmail.com", "Associate Engineer"));
        employees.add(new Employee(3, "Arjun", "Mehta", "arjunmehta@gmail.com", "senior software developer"));
        
        Employees employeeResponse = new Employees();
        employeeResponse.setEmployeeList(employees);

        // Mock behavior
        when(employeeManager.getAllEmployees()).thenReturn(employeeResponse);

        // Perform the test
        Employees result = employeeController.getEmployees();

        // Verify the result
        assertEquals(employees.size(), result.getEmployeeList().size());
    }

    @Test
    void testAddEmployee() {
        // Prepare data
        Employee employee = new Employee(4, "John", "Doe", "john.doe@example.com", "Software Engineer");

        // Mock behavior
        ResponseEntity<Object> responseEntity = ResponseEntity.status(HttpStatus.CREATED).build();
        when(employeeManager.addEmployee(employee)).thenReturn(responseEntity);

        // Perform the test
        ResponseEntity<Object> result = employeeController.addEmployee(employee);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());
    }
}
