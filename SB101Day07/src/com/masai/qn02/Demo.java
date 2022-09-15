package com.masai.qn02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Demo {
	public static void main(String[] args) throws Exception {
		
		Employee e1 = new Employee();
		e1.setName("Amaan");
		e1.setDesignation("Manager");
		e1.setDepartment("Sales");
		e1.setDob("16-08-2001");
		e1.setSalary(10000);
		

		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.close();
		System.out.println("Written the object into File");
		

		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		

		Employee e = (Employee)ois.readObject();
		System.out.println(e);
		
		ois.close();
		
		
	}

}
