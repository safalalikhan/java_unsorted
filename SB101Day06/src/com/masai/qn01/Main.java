package com.masai.qn01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Start of Main");	
		


		try (FileReader fr = new FileReader("abc.txt")) {
			
			char[] chr = new char[(int)(new File("abc.txt")).length()];
			
			fr.read(chr);
			
			for(char c:chr){
			System.out.print(c);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n==================================");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line = br.readLine();
		
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();




	System.out.println("End of Main");	
	}
	

}
