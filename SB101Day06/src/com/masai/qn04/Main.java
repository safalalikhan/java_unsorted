package com.masai.qn04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);	
		
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line=br.readLine();
		
		while(line != null){
		bw.write(line);
		bw.write("\n");
		line=br.readLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		FileReader frNew = new FileReader("output.txt");
		BufferedReader brNew = new BufferedReader(frNew);
		
		String lineNew = brNew.readLine();
		
		while(lineNew != null){
		System.out.println(lineNew);
		lineNew=brNew.readLine();

		}
		
		brNew.close();

		
		
	}

}
