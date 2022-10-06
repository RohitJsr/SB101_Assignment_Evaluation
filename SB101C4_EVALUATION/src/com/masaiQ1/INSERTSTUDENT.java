package com.masaiQ1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;


public class INSERTSTUDENT {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll:");
		int Sroll = scanner.nextInt();
		System.out.println("Enter name:");
		String Sname = scanner.next();
		System.out.println("Enter address:");
		String add = scanner.next();
		System.out.println("Enter mobile:");
		String mob = scanner.next();
		
		
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Problem with loading the driver main class");
			}
			String cString = "jdbc:mysql://localhost:3306/sb101c4";
			try(Connection connection = DriverManager.getConnection(cString,"root","MySQL");) {
				Statement statement =  connection.createStatement();
				int x = statement.executeUpdate("insert into student values("+Sroll+",'"+Sname+"' ,'"+add+"',"+mob+")");
				
				if(x>0) {
					System.out.println(x+" rows inseted");
				}
				else {
					System.out.println("not inserted");
				}
				
			} catch (SQLException e) {
				System.out.println("Problem in establisation of connection ");
			}
		//user(Venkat, Amit, Raj, Binay, Suresh).

	}

}


