package com.masai.usecases;
import java.util.List;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public class GetAllStudentDemo {
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		try {
			List<Student> students= dao.getAllStudentDetails();
			
			students.forEach(s ->{
				System.out.println(s);
			});
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}
