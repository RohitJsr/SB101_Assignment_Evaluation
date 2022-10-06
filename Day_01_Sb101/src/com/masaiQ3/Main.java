package com.masaiQ3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		HashSet<Member> ml= new HashSet<>();
		System.out.println("Enter number how many members you want to add");
		
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter member id");
			int id=sc.nextInt();
			
			System.out.println("Enter member name");
			String name= sc.next();
			System.out .println("ENter member membership id");
			int mem= sc.nextInt();
			System.out.println("Enter membership end date");
			int endate = sc.nextInt();
			
			ml.add(new Member(mem,name,id,endate));
		}
	}

}
