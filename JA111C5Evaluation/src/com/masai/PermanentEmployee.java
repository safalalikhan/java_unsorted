package com.masai;

public class PermanentEmployee extends Employee{
	private double basicPay;

	public PermanentEmployee() {
		
	}
	public PermanentEmployee(int id,String name,double basicPay) {
		super(id,name);
		this.setBasicPay(basicPay);
		this.calculateSalary();
	}
	
	@Override
	public void calculateSalary() {
		super.setSalary((0.88*this.basicPay));
	}
	
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	

}
