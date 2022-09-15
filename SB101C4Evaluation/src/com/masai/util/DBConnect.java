package com.masai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
	
	public static Connection provideConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String url="jdbc:mysql://localhost:3306/sb101c4";
		try {
			con= DriverManager.getConnection(url, "root","root");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
