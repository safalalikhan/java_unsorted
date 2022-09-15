package com.masai.qn03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file name ");
		String name = sc.next();
		// taking input3.txt ;
		Path src = Paths.get(name);
		Path des = Paths.get("newfile.txt");
		
		List<String> data = Files.readAllLines(src).stream().map(line -> line.toUpperCase()).toList();

		
		Files.write(des, data);
		
		sc.close();
		System.out.println("Program finished");
	}
	
}
