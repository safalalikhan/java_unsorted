package com.masai.qn03;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name");
		String name = sc.next();
		
		System.out.println("Enter the character to be counted");
		String ch = sc.next();
		
		@SuppressWarnings("resource")
		FileReader fr = new FileReader(name);
		int i=fr.read();
		
		int count = 0;
		
		while( i != -1) {
			
		String str  = (char)i + "";
		
		if(str.equalsIgnoreCase(ch))count++;
		
		
		i = fr.read();
		
		}
		System.out.println("File " + name + " has " + count + " instances of letter " + ch );
		sc.close();

}
}
