package com.masai;
import java.util.Scanner;
/* Question 1 : is-a and has-a relationship
 * 
 * In a is-a relationship, one class is a type of the other class, it is extended from the other class
 * Example, if we have a class PetAnimals and another class Cats and  Cats is extended from PetAnimals
 *     then we can say Cats is a PetAnimals (here this type of relation is called is-a relation)
 *     
 * In a has-a relation , one class will be an instance or a variable in another class, i.e declared as a feature of the other
 * Example, if we have a class Car and inside that we use another Class Engine as an attribute or a feature 
 *     then we can say that Car has a Engine (here this type of relation is called has-a relation)
 *     
 */



public class Demo {
public static void main(String[] args) {
System.out.println("Evaluation 2, JA111");	
Scanner bag1 = new Scanner(System.in);
Scanner bag2 = new Scanner(System.in);

System.out.println("Q1 done");
System.out.println("Q2 start");

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
System.out.println("Q2 done");
bag1.close();
bag2.close();
}

}

