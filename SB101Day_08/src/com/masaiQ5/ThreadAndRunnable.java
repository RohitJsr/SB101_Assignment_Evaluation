package com.masaiQ5;

public class ThreadAndRunnable {
	/*
	 * Thread Class:-
	 There are two ways to create a new thread of execution.
	  One is to declare a class to be a subclass of the Thread 
	  class. This subclass should override the run method of .
	  the Thread class. An instance of the subclass can then 
	  be allocated and started.
	  		  EXAMPLE:--
class ThreadExample extends Thread{
   public void run(){
      System.out.println("Thread is running");
   }
   public static void main(String args[]){
      ThreadExample t1=new ThreadExample ();
      t1.start();
   }
}

--------------- -------------------------------------------
	  
	  Runnable iNTERFRENCE:-
	  The other way to create a thread is to declare a class that
	   implements the Runnable interface. That class then implements
	    the run method. An instance of the class can then be allocated,
	     passed as an argument when creating Thread, and started.
	
		  EXAMPLE:--
	  class RunnableExample implements Runnable{
   public void run(){
      System.out.println("Thread is running for Runnable Implementation");
   }
   public static void main(String args[]){
      RunnableExample runnable=new RunnableExample();
      Thread t1 =new Thread(runnable);
      t1.start();
   }
}
	  
	 */
	

}
