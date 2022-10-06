package com.masaiQ1;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	import com.mysql.cj.jdbc.Driver;

	public class INSERTCOURSE {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Course Id:");
			int course_Id = scanner.nextInt();
			System.out.println("Enter Course name:");
			String Course_name = scanner.next();
			System.out.println("Enter Course fee:");
			int Course_fee = scanner.nextInt();
			System.out.println("Enter Course duration:");
			String course_duration = scanner.next();
			
			
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Problem with loading the driver main class");
				}
				String cString = "jdbc:mysql://localhost:3306/sb101c4";
				try(Connection connection = DriverManager.getConnection(cString,"root","MySQL");) {
					Statement statement =  connection.createStatement();
					int x = statement.executeUpdate("insert into course values("+course_Id+",'"+Course_name+"' ,'"+Course_fee+"',"+course_duration+")");
					
					if(x>0) {
						System.out.println(x+" rows inseted");
					}
					else {
						System.out.println("not inserted");
					}
					
				} catch (SQLException e) {
					System.out.println("Problem in establisation of connection "+e);
				}
			//user(Java, Spring, Hibernate, React, Angular).


		}

	}



	
	
	

