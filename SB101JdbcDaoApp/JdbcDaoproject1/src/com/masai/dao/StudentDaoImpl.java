package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(int roll, String name, String address, int marks) {
		String result= "Not inserted....";
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			int x= ps.executeUpdate();
			
			if(x > 0)
				result="Inserted Sucessfully ! ";
			
		}catch (SQLException e) {
			result= e.getMessage();
		}
		
		return result;
	}
	@Override
	public String insertStudentDetails2(Student student) {
		String result= "Not inserted....";
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getMarks());
			int x= ps.executeUpdate();
			
			if(x > 0)
				result="Inserted Sucessfully ! ";
			
		}catch (SQLException e) {
			result= e.getMessage();
		}
		return result;
	}
	@Override
	public Student getStudentDetailsByRoll(int roll)throws StudentException {
		Student student=null;
	
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from student where roll=?");
			ps.setInt(1, roll);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("marks");
				
				student=new Student();
				student.setRoll(r);
				student.setName(n);
				student.setAddress(a);
				student.setMarks(m);
			
			}else
				throw new StudentException("Student does not exist with Roll :"+roll);
			
		} catch (SQLException e) {
			//exception rethrowing
			throw new StudentException(e.getMessage());
		}
		return student;
	}
	@Override
	public List<Student> getAllStudentDetails() throws StudentException{
		
		List<Student> students= new ArrayList<>();
			try(Connection conn= DBUtil.provideConnection()) {
				
			PreparedStatement ps= conn.prepareStatement("select * from student");	
			ResultSet rs= ps.executeQuery();
				
			while(rs.next()) {
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("marks");
				Student student=new Student(r, n, a, m);
				
				students.add(student);
			}
			
				if(students.size() == 0)
					throw new StudentException("No student found..");
	
			} catch (SQLException e) {
				throw new StudentException(e.getMessage());
			}

		return students;

	}

}
