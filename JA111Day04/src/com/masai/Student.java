package com.masai;

public class Student {
    private int roll,marks,age;
    private String name,collegeName;
// constructor
    Student(int roll, String name, int marks, int age){
        System.out.println("Inside paramneterised Constructor");
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.age =age;

    }
    Student(){
        System.out.println("Inside zero arg Constructor");
    }


// setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 60) this.age = age;
        else System.out.println("Invalid Age");
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 500) this.marks = marks;
        else System.out.println("Invalid marks");
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }


    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }


    // print details
    public void printDetails(){
        System.out.println("Roll No :" + this.roll);
        System.out.println("Name :" + this.name);
        System.out.println("Marks :" + this.marks);
        System.out.println("Age :" + this.age);
        System.out.println("College Name :"+ this.collegeName);
    }




}
