package com.masai;

public interface Y {
	public abstract void Yabs();
	default void Ydef() {
		System.out.println("Inside Y Ydef");
	}
	public static void Ysta() {
		System.out.println("Inside Y Ysta");
	}

}
