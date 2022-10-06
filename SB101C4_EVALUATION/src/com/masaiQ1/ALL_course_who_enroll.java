package com.masaiQ1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ALL_course_who_enroll {
	
	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course name :");
		String course= sc.next();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101c4";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "MySQL")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("select s.roll, s.name, s.address, s.mobile, c.cname, c.fee, c.duration 	from student s INNER JOIN course c INNER JOIN student_course sc ON s.roll = sc.roll AND c.cid=sc.cid AND c.cname=?");

		ps.setString(1, course);
		
		ResultSet rs = ps.executeQuery();	
		 
		
		if(rs.next()) {
			

		
			int rol= rs.getInt("roll");			
			String nam= rs.getString("name");
			String add= rs.getString("address");
			String mob= rs.getString("mobile");
			String cname= rs.getString("cname");
			int f= rs.getInt("fee");
			String du= rs.getString("duration");
			
			
			System.out.println("Roll is :"+rol);			
			System.out.println("name is :"+nam);

			System.out.println("address is :"+add);			
			System.out.println("mobileno is :"+mob);

			System.out.println("course name is :"+cname);			
			System.out.println("course_fee is :"+f);
			System.out.println("course_duration is :"+du);
			
			System.out.println("=============================");
			
		}else
			System.out.println("No record found");
		
		
		
		
		
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
