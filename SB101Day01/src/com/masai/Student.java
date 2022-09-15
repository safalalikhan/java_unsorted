package com.masai;

public class Student implements Comparable<Student>{
	private int roll,marks;
	private String name;
	
	public Student (int roll,String name, int marks) {
		this.setMarks(marks);
		this.setName(name);
		this.setRoll(roll);
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

	@Override
	public int compareTo(Student o) {
		Student s1 = this;
		Student s2 = o;
		return (s1.getMarks() - s2.getMarks());
	}
	@Override
	public String toString() {
		String details = "[ Name: "+this.getName()+", Roll: "+this.getRoll()+", Marks: "+this.getMarks()+" ]";
		return details;
	}
	
	
	

}
