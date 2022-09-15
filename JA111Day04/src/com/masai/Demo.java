package com.masai;

public class Demo {
    Demo(){
        this("Safal");
        System.out.println("Inside zero arg constructor");
    }
    Demo(String s){
        this(01);
        System.out.println("Inside string constructor");
    }
    Demo(int i){
        this(1.2f);
        System.out.println("Inside integer constructor");
    }
    Demo(float f){
        System.out.println("Inside float constructor");
    }
}
