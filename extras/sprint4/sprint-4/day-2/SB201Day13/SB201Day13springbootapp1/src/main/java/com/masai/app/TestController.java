package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/hello")
	public String sayHello() {
		return  "Welcome to Spring Boot";
	}
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1, "Safal", 10);
	}
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Safal", 10000));
		employees.add(new Employee(2, "Amal", 12300));
		employees.add(new Employee(3, "Arun", 15000));
		employees.add(new Employee(4, "Appu", 8000));
		return employees;

		
	}
	
	
	
}