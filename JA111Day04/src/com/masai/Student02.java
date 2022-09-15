package com.masai;

public class Student02 {
    private int roll;
    private String name,address,collegeName;
    // constructor
    Student02(int roll, String name, String address, String collegeName){
        this.name = name;
        this.roll = roll;
        this.address = address;
        this.collegeName =collegeName;
    }

    Student02(int roll,String name,String address){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collegeName = "NIT";
    }


    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getAddress() {
        return address;
    }

    public int getRoll() {
        return roll;
    }


    // print details
    public void printDetails(){
        System.out.println("Roll No :" + this.roll);
        System.out.println("Name :" + this.name);
        System.out.println("Address :" + this.address);
        System.out.println("College Name :"+ this.collegeName);
    }
//

    public static Student02 getStudent(boolean isFromNIT){
        if(isFromNIT){
            return  new Student02(01,"Safal","Kottayam");

        }
        else {
            return new Student02(02,"Amaan","Kottayam","CUSAT");
        }

    }


}
