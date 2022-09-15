package com.masai.qn02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		studentDB students = new studentDB();
		System.out.println("Enter the details of 5 students :");
		
		System.out.println("============================================");
		for(int i = 0 ; i < 5; i ++) {
			System.out.println("Enter id");
			String id = sc.next();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter email");
			String email = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			
			students.addStudent(new Student(id,name,address,email,password));
		}
		System.out.println("============================================");
//		System.out.println(students.studentsData);
		sc.close();
		FileOutputStream fos = new FileOutputStream("dataBase.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		oos.close();
		
		FileInputStream fis = new FileInputStream("dataBAse.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		studentDB studentlist = (studentDB)ois.readObject();
		ois.close();
		
		studentlist.studentsData.forEach(s -> System.out.println(s));
		
		
		

	}

}
