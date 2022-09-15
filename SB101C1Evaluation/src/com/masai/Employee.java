package com.masai;

public class Employee implements Comparable<Employee>{
	private String empId,name,address;
	public Employee() {
		
	}
	public Employee(String empId,String name,String address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int compareTo(Employee e) {
		return (this.name.compareTo(e.getName()));
	}
	
	
	@Override
	public String toString() {
		String details = "[ Name: "+this.getName()+", EmployeeId: "+this.getEmpId()+", Address: "+this.getAddress()+" ]";
		return details;
	}
	

}
