package jdbc_project_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee id :");
		int empid= sc.nextInt();
		
		System.out.println("Enter employee name :");
		String ename= sc.next();
		
		System.out.println("Enter employee address :");
		String add= sc.next();
		
		System.out.println("Enter modile :");
		String modile= sc.next();;
		
		System.out.println("Enter deptid :");
		int deptid= sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "MySQL")) {

			
			
		
		 PreparedStatement ps= conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		 
		 
		
			
		ps.setInt(1, empid);	
		ps.setString(2, ename);
		ps.setString(3, add);
		ps.setString(4, modile);
		ps.setInt(5, deptid);
		
		
		
		
		int x= ps.executeUpdate();	
		 
		if(x > 0)
			System.out.println("Record Inserted Sucessfully");
		else
			System.out.println("Not inserted...");
		 
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
