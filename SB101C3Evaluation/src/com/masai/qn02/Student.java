package com.masai.qn02;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class Student implements Serializable{
	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentId, other.studentId);
	}

	private String studentId,studentName,studentAddress,student_email;
	private transient String studentPassword;
	
	public Student() {
	}

	public Student(String studentId, String studentName, String studentAddress, String student_email,
			String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.student_email = student_email;
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", student_email=" + student_email + ", studentPassword=" + studentPassword + "]";
	}
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

}
