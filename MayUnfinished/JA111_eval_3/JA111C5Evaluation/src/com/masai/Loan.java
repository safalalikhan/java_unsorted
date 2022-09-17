package com.masai;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double amount=0;
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee employee = (PermanentEmployee)employeeObj;
			amount = employee.getSalary() * 0.15;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			TemporaryEmployee employee = (TemporaryEmployee)employeeObj;
			amount = employee.getSalary() * 0.10;
		}
		else {
			System.out.println("Invalid Employee, No loan");
			amount = 0;
		}
		return amount;
	}
	private Loan() {
		
	}
	public static Loan getLoan() {
		Loan loan = new Loan();
		return loan;
	}

}
