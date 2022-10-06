package com.masaiQ4;

public class CheckOutput {
	public static void main(String args[])
	{
	try
	{
	System.out.print("A");
	int num = 99/0;
	System.out.print("B");
	}
	catch(ArithmeticException ex)
	{
	System.out.print("C");
	}
	catch(Exception ex)
	{
	System.out.print("D");
	}
	System.out.print("E");
	}
/*
 Output of this code is-ACE  
 Because num is divided by o its value is infinity so in java its exception ArithmeticException 
 after entring a try block A print after  ArithmeticException print C and after out of try catch block printing E
 all are in print method so its print in one line. 
 */
}
