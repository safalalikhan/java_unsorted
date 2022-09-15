package com.masai;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfPercentage) {
		double net = this.salary * (100-pfPercentage)/100;
		this.netSalary = net;
	}
	public void displayDetails() {
		System.out.println("Id "+ this.getEmployeeId());
		System.out.println("Name "+ this.getEmployeeName());
		System.out.println("Salary "+ this.getSalary());
		System.out.println("NetSalary "+ this.getNetSalary());
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	

}
