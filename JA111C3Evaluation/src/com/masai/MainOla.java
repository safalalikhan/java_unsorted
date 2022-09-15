package com.masai;

import java.util.Scanner;

public class MainOla {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	//Write logic to get numberOfPassenger and numberOfKms
	System.out.println("Enter Number of Passengers :");
	int numberOfPassenger = scanner.nextInt();
	System.out.println("Enter the Number of KMs :");
	int numberOfKms = scanner.nextInt();
	Ola myOla = new Ola();
	Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
	int res = myOla.calculateBill(myCar);
	System.out.println("The total fare amount is "+ res);

}

}
