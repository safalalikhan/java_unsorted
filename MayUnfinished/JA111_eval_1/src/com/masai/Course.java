package com.masai;

public class Course {
	int courseId;
	String courseName;
	int courseFee;

	public void displayCourseDetails() {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	public static void authenticate(String un,String pw) {
	if(un == "Admin" && pw == "1234") {
	

	}
	else System.out.println("Invalid Username or Password");
	}
}
