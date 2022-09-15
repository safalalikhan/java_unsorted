package com.masaij04;

public class Question4 {
	
public void NextNumber(int x) {
	if(x < 0) {
		System.out.println("Error");
	}
	else if (x % 2 == 0) {
		
		System.out.println((x+10) - (x%10));
	}
	else {
		System.out.println(x);
	}
}


}
