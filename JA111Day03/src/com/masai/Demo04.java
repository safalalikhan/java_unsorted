package com.masai;

public class Demo04 {

    public  static void main(String [] args){
        Student s1 = new Student(01,95,"Safal");
        Student s2 = new Student (02,90, "Amaan");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.gc();

    }
}
