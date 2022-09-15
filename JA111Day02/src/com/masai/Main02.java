package com.masai;

public class Main02 {
    public static void main(String[] args)
    {

        int n = 12;
        printFact(n);
        printFact(102);

    }
    public static void printFact(int n){
        if(n <2 || n >100 ){
            System.out.println("Invalid number");
            return;
        }
        for( int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
