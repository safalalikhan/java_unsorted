package com.masai;

public class Employee implements Comparable<Employee>{
	private String empName;
	private int salary,empId;
	public Employee() {
		
	}
	public Employee(int empId,String name,int salary) {
		this.empId = empId;
		this.empName = name;
		this.setSalary(salary);
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}


	
	@Override
	public int compareTo(Employee e) {
		return (this.empName.compareTo(e.getName()));
	}
	
	
	@Override
	public String toString() {
		String details = "[ EmpName: "+this.getName()+", EmployeeId: "+this.getEmpId()+", Salary: "+this.getSalary()+" ]";
		return details;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
