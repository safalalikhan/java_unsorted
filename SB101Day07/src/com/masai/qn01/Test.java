package com.masai.qn01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Student s = (Student)obj;
		
		System.out.println(s);
		
		ois.close();
		
	}

}
