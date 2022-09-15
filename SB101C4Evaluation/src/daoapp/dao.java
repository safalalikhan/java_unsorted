package daoapp;
import com.masai.Student;
import com.masai.Exception.StudentException;

public interface dao {

	public String insertStudent(int roll, int fee, String name, String std, String dob);
	public Student findStudentById(int roll)throws StudentException;
	public Student findStudentByNameId(String name,int roll)throws StudentException;
	public Student updateStudentNameById(String name,int roll)throws StudentException;
	public String deleteStudentById(int roll)throws StudentException;
	

}
