package com.masai;


import java.util.Map;
import java.util.TreeMap;

public class MainQn1 {
	public static void main(String[] args) {
		TreeMap<Employee,Integer> employees = new TreeMap<>();
		employees.put(new Employee("001","Safal","Kottayam"),10000);
		employees.put(new Employee("004","Anjali","Kollam"),15000);
		employees.put(new Employee("003","Yogesh","Bangalore"),23000);
		employees.put(new Employee("007","Nrupul","Kolkata"),15000);
		employees.put(new Employee("002","Arun","Delhi"),50000);
		employees.put(new Employee("005","Amal","Kottayam"),5000);

//		System.out.println(employees);
		for(Map.Entry<Employee, Integer> entry : employees.entrySet()) {
			System.out.println("Details: " + entry.getKey() + ", Salary => " + entry.getValue());
		}

	}

}
