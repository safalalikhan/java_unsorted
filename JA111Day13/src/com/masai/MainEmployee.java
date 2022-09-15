package com.masai;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		Employee employee = getEmployeeDetails();
		employee.displayDetails();
		
	}
	
	public static Employee getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter Employee Name");
		e.setEmployeeName(sc.next());
		System.out.println("Enter Employee Id");
		e.setEmployeeId(sc.nextInt());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextDouble());
		e.calculateNetSalary(getPFPercentage());
		return e;

	}
	public static int getPFPercentage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PF percentage");
		return (sc.nextInt());
	}


}
