package com.masai.qn04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {
	public static void main(String[] args) throws Exception {
		Employee e1 = new Employee("001", "Safal", new Address("Keral", "Kottayam", "686105"), "safalalikhan@gmail.com", "safal123");
		
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		
		System.out.println("Serializing done");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Employee e2 = (Employee)obj;
		ois.close();

		System.out.println(e2);
		System.out.println("End of main");
		
		
	}

}
