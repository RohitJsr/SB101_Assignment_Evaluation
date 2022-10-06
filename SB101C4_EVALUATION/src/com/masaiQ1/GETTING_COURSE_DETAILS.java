package com.masaiQ1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GETTING_COURSE_DETAILS {
	
	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter roll :");
		int roll= sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101c4";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "MySQL")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("select * from  student_course where roll = ?");
		ps.setInt(1, roll);
		//
		 	
		ResultSet rs = ps.executeQuery();	
		 
		
		if(rs.next()) {
			
			
			int rol= rs.getInt("roll");
			
			int course_id= rs.getInt("cid");
			
			
			System.out.println("Roll is :"+rol);			
			System.out.println("course_id is :"+course_id);
			
			System.out.println("=============================");
			
		}else
			System.out.println("No record found");
		
		
		
		
		
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}


}
