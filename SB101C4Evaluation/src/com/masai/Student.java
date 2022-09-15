package com.masai;

public class Student {
	
	private int roll,fee;
	private String name,std,dob;
	public Student() {
	}
	public Student(int roll, int fee, String name, String std, String dob) {
		this.roll = roll;
		this.fee = fee;
		this.name = name;
		this.std = std;
		this.dob = dob;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", fee=" + fee + ", name=" + name + ", std=" + std + ", dob=" + dob + "]";
	}


}

