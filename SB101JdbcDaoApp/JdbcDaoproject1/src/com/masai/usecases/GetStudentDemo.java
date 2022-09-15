package com.masai.usecases;
import java.util.Scanner;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public class GetStudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll= sc.nextInt();

		StudentDao dao=new StudentDaoImpl();
		try {
			Student student= dao.getStudentDetailsByRoll(roll);
			System.out.println(student);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
