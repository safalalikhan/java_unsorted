package com.masai.qn01;
import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("student.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		ArrayList<Student> students =  new ArrayList<>();
		
		while(str != null) {
			Student s = new Student();
			s.name = str;
			str = br.readLine();
			for(int i = 0 ; i < 5; i++) {
				s.marks[i] = Integer.parseInt(str);
				str = br.readLine();
			}
			students.add(s);
		}
		br.close();

		PrintWriter pw = new PrintWriter("reportCard.txt");

		for(Student s : students) {
			str = s.toString();
			pw.println(str);
		}
		pw.flush();
		pw.close();
		System.out.println("Finished");

	}

}
