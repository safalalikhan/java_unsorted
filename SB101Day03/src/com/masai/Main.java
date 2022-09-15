package com.masai;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Question1 \n");
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(11,"Name1",450));
		students.add(new Student(12,"Name2",475));
		students.add(new Student(13,"Name3",250));
		students.add(new Student(14,"Name4",150));
		students.add(new Student(15,"Name5",50));
		students.add(new Student(1,"Name10",450));
		students.add(new Student(2,"Name9",475));
		students.add(new Student(3,"Name8",250));
		students.add(new Student(4,"Name6",150));
		students.add(new Student(5,"Name7",50));
		
		students.stream().sorted().filter(s -> s.getMarks() < 250).forEach( s -> System.out.println(s.toString()));
		System.out.println("\n==========================");

		System.out.println("Question2 \n");
		
		List<Student> students02 = new ArrayList<>();
		
		students02.add(new Student(13,"Name3",750));
		students02.add(new Student(14,"Name4",950));
		students02.add(new Student(15,"Name5",450));
		students02.add(new Student(1,"Name10",870));
		students02.add(new Student(2,"Name9",975));
		

		List<Student> updatedList = students02.stream().sorted().filter(s -> s.getMarks() > 800).collect(Collectors.toList());
		updatedList.forEach(s->System.out.println(s.toString()));

		


		
		
	}

}
