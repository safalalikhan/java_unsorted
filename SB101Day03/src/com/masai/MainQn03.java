package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainQn03 {
	public static void main(String[] args) {
		List<Student> students03 = new ArrayList<>();
		
		students03.add(new Student(13,"Name3",750));
		students03.add(new Student(14,"Name4",950));
		students03.add(new Student(15,"Name5",450));
		students03.add(new Student(1,"Name10",870));
		students03.add(new Student(2,"Name9",975));
		
		List<Employee> newEmployeeList = students03.stream().map(s -> studentToEmployee(s)).collect(Collectors.toList());
		newEmployeeList.forEach(e->System.out.println(e.toString()));
		
		
	}
	public static Employee studentToEmployee(Student s) {
		Employee e = new Employee(s.getRoll(),s.getName(),s.getMarks()*1000);
		return e;
	}

}
