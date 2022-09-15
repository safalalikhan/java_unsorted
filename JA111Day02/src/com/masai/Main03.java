package com.masai;

public class Main03 {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(sum(n));
    }
    public static int sum(int n){

        int sum = n * (n+1)/2;
        return sum;
    }
}
