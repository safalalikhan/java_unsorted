package com.masai;

public class Main {
    public static void main(String[] args) {
        //Qn 1
        Student s1 = new Student();
        Student s2 = new Student(01,"Akshara",490,23);
        s1.printDetails();
        s2.printDetails();

        //Qn 2
        Demo d1 = new Demo();

        //Qn 3
        Student02 S1 = Student02.getStudent(true);
        Student02 S2 = Student02.getStudent((false));
        S1.printDetails();
        S2.printDetails();


    }
}
