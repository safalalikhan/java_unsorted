package com.masai.qn01;

public class Student {
	String name;
	int[] marks = new int[5];
	@Override
	public String toString() {
		int total = 0;
		for(int i = 0 ; i < 5 ; i++) {
			total += this.marks[i];
		}
		int average = total/5;
		return name + " total mark = " + total +" and Average = " + average;
	}
}
