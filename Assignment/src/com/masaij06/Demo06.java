package com.masaij06;
import java.util.Scanner;

public class Demo06 {
	public static String reversString(String str){
		char ch;
		String rev="";
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        rev= ch + rev;
	      }
		return rev;
		}
		public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	    for (int j = 0; j < arr.length; j++)
	    {  int sum = 0;
	        for (int i = 0; i < arr[j].length; i++) {
		        if (arr[j][i] % 2 == 0)sum += arr[i][j];
	        }
	        System.out.println(sum);
		}
	    int arr1[] = {1,2,3,4,5,6,7}; 
	    
   
    	public static int[] findPrime(int[] inputA){
	    	int[] newarr;
	    	int x = 0;
	    	
	    	for(int i = 0; i < inputA.length; i++) {
	    		if(prime(inputA[i])) {
	    			newarr[x] = inputA[i];
	    			x++;
	    		}
	    	}
	    	

	    	}

}
    	public static boolean prime(int n)
    	{
    	    for(int i = 2; i * i <= n; i++)
    	        if(n % i == 0)
    	            return false;
    	             
    	    return true;
    	}
}
