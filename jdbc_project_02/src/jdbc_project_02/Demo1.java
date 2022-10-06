package jdbc_project_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "MySQL")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("select * from employee");
		 	
		ResultSet rs = ps.executeQuery();	
		 
		
		while(rs.next()) {
			
			
			int r= rs.getInt("empID");
			String n= rs.getString("ENAME");
			String ad= rs.getString("ADDRESS");
			String mob= rs.getString("MOBILE");
			int did= rs.getInt("DEPTID");
			
			//| ADDRESS | varchar(12) | YES  |     | NULL    |       |
			//| MOBILE  | char(10)    | YES  |     | NULL    |       |
			//| DEPTID  | int         | YES  | MUL | NULL    |       |
			//+---------+-------------//
			
			System.out.println("empID is :"+r);
			System.out.println("ENAME is :"+n);
			System.out.println("ADDRESS is :"+ad);
			System.out.println("MOBILE is :"+mob);
			System.out.println("DEPTID is :"+did);
			
			System.out.println("=============================");
			
		}
				 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}