package com.masaij11;

public class Demo {
enum Stadium{
	EDEN_GARDENS_STADIUM,
	WANKHEDE_STADIUM,
	CHIDAMBARAM_STADIUM,
	M_CHINNASWAMY_STADIUM,
}
public static void main(String args[]) {
	Stadium stadium = Stadium.CHIDAMBARAM_STADIUM;
	
	switch (stadium) {
	case CHIDAMBARAM_STADIUM: {
		
		System.out.println("CSK");
	}
	case EDEN_GARDENS_STADIUM: {
		
		System.out.println("KKR");
	}
	case M_CHINNASWAMY_STADIUM: {
		
		System.out.println("RCB");
	}
	case WANKHEDE_STADIUM: {
		
		System.out.println("MI");
	}
	default:
		System.out.println("Enter Another staidum");
	}
}
}
