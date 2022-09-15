package com.masai;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public Employee() {
		
	}
	public Employee(int id,String name) {
		this.setEmployeeId(id);
		this.setEmployeeName(name);
	}
	public abstract void calculateSalary();
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
