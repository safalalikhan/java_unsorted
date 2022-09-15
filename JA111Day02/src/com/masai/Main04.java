package com.masai;

public class Main04 {
    public static void main(String[] args)
    {
        int a=5,b=1,c=1,d=1,e=1;
        score(a,b,c,d,e);
    }
    public static void score( int a,int b,int c,int d,int e){
        int sum = a*1 + b*2 + c*3 + d*4 + e*6;
        System.out.println("Score:" + sum);
    }
}
