package com.masai;

public class TemporaryEmployee extends Employee{
	private int hoursWorked,hourlyWages;
	
	public TemporaryEmployee() {
		
	}
	public TemporaryEmployee(int id, String name, int hours,int wages) {
		super(id,name);
		this.setHourlyWages(wages);
		this.setHoursWorked(hours);
		this.calculateSalary();
		
	}
	
	@Override
	public void calculateSalary() {
		super.setSalary((this.hourlyWages * this.hoursWorked));
	
	}
	

	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}


}
