package com.masaiQ6;

public class RunAndStart {

	/*
	 When we call start() method on the thread it causes the thread 
	 state to change to "Runnable". It’s the Java Virtual Machine that 
	 calls the run method of that thread to actually start the thread
	  execution, run() method is not called directly. In this post you'll 
	  see what happens if run() method is called directly in Java multi-threading.
	 
	 example:-
	 
	 public class MyThreadClass extends Thread{
  @Override
  public void run(){
    System.out.println("In run method " + Thread.currentThread().getName());
    for(int i = 0; i < 5 ; i++){
      System.out.println("i - " + i);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
    
  public static void main(String[] args) {
    MyThreadClass mc1 = new MyThreadClass(“MyThread1”);
    MyThreadClass mc2 = new MyThreadClass();
    mc1.run();
    mc2.run();
  }
}
	 */
}
