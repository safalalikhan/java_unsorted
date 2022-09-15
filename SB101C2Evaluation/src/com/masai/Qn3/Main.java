package com.masai.Qn3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		    students.add(new Student (12, 495, "Name1"));
		    students.add(new Student (13, 230, "Name2"));
		    students.add(new Student (10, 210, "Name5"));
		    students.add(new Student (6, 400, "Name3"));
		    students.add(new Student (2, 352, "Name4"));
		    
		    Stream<Student> str = students.stream().sorted();

		    List<Student> finalList = str.filter(s -> s.getMarks() < 250).collect(Collectors.toList());
		    for(Student s : finalList) {
		    	System.out.println("Student" + s);
		    }
		    
		    
		    
	}

}
