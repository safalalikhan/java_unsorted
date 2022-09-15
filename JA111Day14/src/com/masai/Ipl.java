package com.masai;

import java.util.Scanner;

public class Ipl {
	public static void homeTeamStadium(Stadium stadium) {
		switch(stadium){
		case EDEN_GARDENS_STADIUM :System.out.println("This is the home ground of KKR");
		break;
		case WANKHEDE_STADIUM : System.out.println("This is the home ground of Mumbai Indians");
		break;
		case CHIDAMBARAM_STADIUM : System.out.println("This is the home ground of CSK");
		break;
		case M_CHINNASWAMY_STADIUM : System.out.println("This is the home ground of RCB");
		break;
	
		default:
			System.out.println("Invalid input");
			break;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an IPL stadium name separated by '_' ");
		String stadium = sc.next().toUpperCase();
//		System.out.println("Stadium:" + stadium);
		
		Stadium s = Stadium.valueOf(stadium);
		homeTeamStadium(s);
		
		sc.close();
		
		
		
	}

}
