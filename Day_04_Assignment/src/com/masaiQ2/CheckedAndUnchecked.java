package com.masaiQ2;

public class CheckedAndUnchecked {

	
	/*
	 Checked Exceptions
	 Java checked exceptions are those exceptions, as the name suggests, which a method must handle in its body 
	 or throw to the caller method so the caller method can handle it.

	Checked exceptions are checked by the Java compiler so they are called compile time exceptions.
	
	To make the program able to compile, we must handle this error situation in the try-catch block. Below given code will compile absolutely fine.

	public static void main(String[] args)
	{
	    try
	    {
			FileReader file = new FileReader("somefile.txt");
		}
	    catch (FileNotFoundException e)
	    {
	    	//Alternate logic
			e.printStackTrace();
		}
	}
	
	 Unchecked Exception
	Unchecked exceptions are not checked by the compiler. These are called runtime exceptions.

	Unchecked exceptions will come into life and occur in the program, once any buggy code is executed.

	In Java, a member method is not forced by the compiler to declare the unchecked exceptions into the method declaration. 
	Generally, such methods almost always do not declare them.
	Unchecked Exceptions are subclasses of RuntimeException class.
	
	ArithmeticException
	ArrayStoreException
	ClassCastException
	The strange thing is that RuntimeException is itself subclass of Exception i.e. all unchecked exception classes should have been checked exceptions implicitly, 
	BUT they are not.”
	
	JVM not forcing us to check NullPointerException
	public static void main(String[] args)
	{
	    try
	    {
			FileReader file = new FileReader("pom.xml");
	
			file = null;
	
			file.read();
		}
	    catch (IOException e)
	    {
	    	//Alternate logic
			e.printStackTrace();
		}
}
	
	 */
}
