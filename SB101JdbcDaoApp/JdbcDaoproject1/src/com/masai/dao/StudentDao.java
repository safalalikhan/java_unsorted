package com.masai.dao;
import java.util.List;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;
public interface StudentDao {
	
	public String insertStudentDetails(int roll, String name, String address, int marks);
	
	public String insertStudentDetails2(Student student);
	
	public Student getStudentDetailsByRoll(int roll)throws StudentException;

	public List<Student> getAllStudentDetails()throws StudentException;
	
	//public int getStudentMarksByRoll(int roll)throws StudentException;
	
	//public String deleteStudentByRoll(int roll)throws StudentException;
	
	//public Student givetheGraceMarks(int roll, int gMarks)throws StudentException;
}
