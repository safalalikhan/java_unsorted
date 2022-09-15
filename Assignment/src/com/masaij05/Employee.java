package com.masaij05;

public class Employee {
private int employeeId ;
private String employeeName;
private double salary;
private int pfPercentage;
private double netSalary;
public void getNetsalary() {
	netSalary = salary - salary*pfPercentage;
	System.out.println("Slaray" + netSalary);
}
public void calculateNetSalary(int pfPercentage) {
	
}
public static Employee getEmployeeDetails()	{
	Employee e1 = new Employee();
	return e1;
}
public static int getPFPercentage() {
	System.out.println("Enter pf percentage ?");
	int pfPercentage =5;
	return pfPercentage;
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
}
