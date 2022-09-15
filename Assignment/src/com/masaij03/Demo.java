package com.masaij03;
/*
 * > Difference between static and non static ?
 *  A static variable or method is shared and can be accessed  by all the objects of the given class
 *  but a non-static variable or method is available only to the instance object in which they are created.
 */
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
Scanner bag1 = new Scanner(System.in);
Scanner bag2 = new Scanner(System.in);


int num1s = 0,sum1 = 0;
Student[] students= new Student[10];
System.out.println("Enter number of Students(less than 10 preffered)");
num1s = bag1.nextInt();
//System.out.println(num1s);
int roll1 = 0, marks1 = 0;
String name1 = "abc",address1 = "abc";
for(int i = 0; i < num1s; i++ ) {
	students[i] = new Student();
	System.out.println("Enter Roll number)");
	roll1 = bag1.nextInt();
	System.out.println("Enter Name");
	name1 = bag2.nextLine();
	System.out.println("Enter Address");
	address1 = bag2.nextLine();
	System.out.println("Enter Marks");
	marks1 = bag1.nextInt();
	sum1 += marks1;
	students[i].setData(roll1, name1, address1, marks1);
}
for(int i = 0 ; i < num1s;i++) {
students[i].getData();
}
System.out.println("Average marks :" + sum1/num1s);
bag1.close();
bag2.close();
}

}

