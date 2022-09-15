package com.masai.qn01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(new Address("Kottayam", "686105"), "safalalikhan@gmail.com", "safal123");
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.close();
		
		System.out.println("Serializing done");
		
	}

}
