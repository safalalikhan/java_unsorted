package com.masaij09;

public class Student {
private int roll,marks;
private String name;
private char grade;

public void displayDetails() {
	
}
private char calculateGrade() {
	if(this.marks >= 500) this.grade = 'A';
	else if(this.marks >= 400) this.grade = 'B';
	else this.grade = 'C';
	
	return this.grade;
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}


}
