package com.masai.qn01;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Student implements Serializable{
	private Address address;
	private String email;
	private transient String password;
	
	Student(Address address,String email,String password){
		this.address = address;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [address=" + address + ", email=" + email + "]";
	}

	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
