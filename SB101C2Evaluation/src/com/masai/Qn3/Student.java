package com.masai.Qn3;



public class Student implements Comparable<Student>{
	private int roll,marks;
	private String name;
	
	public Student() {
		
	}
	public Student(int roll,int marks,String name) {
		this.setRoll(roll);
		this.setName(name);
		this.setMarks(marks);
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
		if(marks >=0 && marks <= 500)this.marks = marks;
		else throw new IllegalArgumentException(marks + "is out of range");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String details = "[RollNo= "+this.getRoll()+", marks= "+this.getMarks()+", name "+this.getName()+"]";
		return details;
	}

	@Override
	public int compareTo(Student o) {
		return(this.getRoll()- o.getRoll());
	}

	

}
