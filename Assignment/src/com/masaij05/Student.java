package com.masaij05;

public class Student {
static int roll =0,age = 0,marks =0;
static String name="name";
Student(){
	System.out.println("Inside empty constructor");
}
Student(int roll, int age, int marks, String name) {
	System.out.println("Inside parameterised constructor");
	Student.roll = roll;
	if(age<60 && age >=18) {
		Student.age = age;

	}
	else System.out.println("Invalid age");
	if(marks<=500  && marks>= 0) {
		Student.marks = marks;

	}
	else System.out.println("Invalid Marks");
	Student.name = name;
}

}
