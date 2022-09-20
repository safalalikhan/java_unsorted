package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "e1", 5000));
		employees.add(new Employee(2, "e2", 6000));
		employees.add(new Employee(3, "e3", 4000));
		employees.add(new Employee(1, "e1", 5000));

		Collections.sort(employees,(e1,e2)->(e1.getSalary()>e2.getSalary() ? 1 : -1));
		
		
		
		
		

		
		
		
	}

}
