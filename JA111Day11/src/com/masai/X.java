package com.masai;

public interface X {
	public abstract void Xabs();
	
	default void Xdef() {
		System.out.println("Inside X Xdef");
		
	}
	public static void Xsta() {
		System.out.println("Inside X Xsta");
		
	}

}
