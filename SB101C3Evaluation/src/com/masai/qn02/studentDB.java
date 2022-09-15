package com.masai.qn02;

import java.io.Serializable;
import java.util.HashSet;

@SuppressWarnings("serial")
public class studentDB implements Serializable{
	HashSet<Student> studentsData = new HashSet<>();
	
	public void addStudent(Student student){
		this.studentsData.add(student);
	}

}
