package com.masaiQ1;

import java.util.Scanner;

public class CheckInput {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try {
		int num= sc.nextInt();
		System.out.println(num*num);
	}catch(Exception ae){
		System.out.println("Enter input is not a valid format for an integer");
	}
		System.out.println("The work has been done successfully");
	}

}
