package com.masaiQ1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
 System.out.println("start of main..");
	Scanner sc = new Scanner(System.in);
	try{System.out.println("Enter num1");
	int num1 = sc.nextInt();
	//boolean b =false;  
	
	System.out.println("Enter num2");
	int num2 = sc.nextInt();
	 


	int num3 = num1 / num2;
	if(num3 > 10){
        return ;
    } else {
        return;
    }
	
	
	}

catch (InputMismatchException  e) {
	System.out.println("Please enter valid number");
	System.out.println(e.getMessage());
}catch (ArithmeticException  ae) {

	System.out.println("num2 should not be 0");
	System.out.println(ae.getMessage());
}
	catch (Exception e) {
	System.out.println("Welcome to Exception Handling ") ;

	      System.out.println("Exception => " + e.getMessage());
}
	System.out.println("end of main");
	}
	
}
