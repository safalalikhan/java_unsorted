package com.masai;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getMarks() != s2.getMarks())
		return (s1.getMarks()-s2.getMarks());
		else
			return (s1.getRoll()-s2.getRoll());
	}
	

}
