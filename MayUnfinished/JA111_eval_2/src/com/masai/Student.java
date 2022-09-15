package com.masai;

public class Student {
int roll=0 ;
String name="abc";
String address="abc";
int marks=0;

void setData(int r,String n,String a,int m) {
	name = n;
	roll =r;
	address = a;
	marks = m;
}
void getData() {
	System.out.println("Name:" + name);
	System.out.println("RollNo:" + roll);
	System.out.println("Address:" + address);
	System.out.println("Marks:" + marks);
}
}
