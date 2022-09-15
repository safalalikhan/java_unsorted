package com.masaij04;

public class Demo {

	public static void main(String[] args){
		//qn4
		System.out.println("Qn4");
		Question4 q1 = new Question4();
		q1.NextNumber(44);
		q1.NextNumber(45);
		q1.NextNumber(-12);
		
		//qn1
		System.out.println("Qn1");
		@SuppressWarnings("unused")
		Student s1 = new Student();
		@SuppressWarnings("unused")
		Student s2 = new Student(1,20,400,"Safal");
		
		//qn2
		System.out.println("Qn2");
		@SuppressWarnings("unused")
		DemoQ3 d1 = new DemoQ3();
		d1 = new DemoQ3(1);
		d1 = new DemoQ3("ABC");
		d1 = new DemoQ3(1.234f);
		
	}
}
