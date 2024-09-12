package com.java.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.angular.model.Employee;
import com.java.angular.repository.EmployeeRepository;

// REST API's got created here

@RestController
@RequestMapping("/api/v1/") // standard version declaration for api's
public class EmployeeController {

	// inject repository 
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
	     return employeeRepository.findAll();
	   }
	
}
