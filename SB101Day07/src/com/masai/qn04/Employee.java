package com.masai.qn04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private String empId,empName,email;
	private transient String password;
	private Address address;
	
	Employee(String id,String name,Address address,String email, String password){
		this.empId = id;
		this.empName=name;
		this.address=address;
		this.email=email;
		this.password=password;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", address=" + address + "]";
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
