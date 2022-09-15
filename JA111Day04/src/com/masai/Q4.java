package com.masai;

public class Q4 {
    public void printNumber(int i){
        if(i < 0){
            System.out.println("error");
        }
        else if(i % 2 == 0){
            System.out.println((i/10 + 1)*10);
        }
        else{
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Q4 q = new Q4();
        q.printNumber(44);
        q.printNumber(45);
        q.printNumber(-45);

    }
}
