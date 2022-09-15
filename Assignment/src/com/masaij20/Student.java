package com.masaij20;

public class Student {
private int roll,marks;
private String name;
Student(){	
}
Student(int r,int m,String n){
	this.name = n;
	this.marks = m;
	this.roll = r;
}

public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
