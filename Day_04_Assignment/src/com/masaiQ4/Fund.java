package com.masaiQ4;

import java.util.Scanner;

public class Fund {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter 1st number");
//		int num=sc.nextInt();
//		System.out.println("Enter 2nd number");
//		int num2=sc.nextInt();
		 try {
		 int [] arr= new int [2];
		 System.out.println("Enter the 2 numbers");
		 for(int i=0;i<arr.length;i++) {
			 
			 arr[i]=(sc.hasNext()==true? sc.nextInt():null);
		 }	
		
		int c=arr[0]/arr[1];
		System.out.println("The qrotient of "+arr[0]+"/"+arr[1]+"="+c);
		 } catch (ArithmeticException e) {
			// System.out.println("Exception handled");
			 System.out.println(e);
			 }
			 finally {
			 System.out.println("Inside finally block");
			 }
			

		 
	}
}
