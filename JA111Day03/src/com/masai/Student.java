package com.masai;

public class Student {
    private int roll,marks;
    private String name;
    Student(int r, int m, String n){
        this.roll = r;
        this.marks = m;
        this.name = n;
    }
    public void displayStudentDetails(){
        System.out.println("Roll is :"+ this.roll);
        System.out.println("Marks is :"+ this.marks);
        System.out.println("Name is :"+ this.name);
    }

}
