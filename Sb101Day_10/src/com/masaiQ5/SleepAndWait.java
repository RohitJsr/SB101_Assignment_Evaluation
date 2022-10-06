package com.masaiQ5;

public class SleepAndWait {
	/*
	 The sleep() method is a static method of Thread class and it can send the current running thread into a “Non-Runnable” state whereas wait() method is an instance method, we are calling it using thread object and it is only affected for that object. The sleep() method wakeup after time expires or call the interrupt() method whereas wait() method wakeup after time expires or call notify() or notifyAll() method. The sleep() method doesn't release any lock or monitor while waiting whereas wait() method releases the lock or monitor while waiting.

Syntax for sleep() method 
public static void sleep(long millis) throws InterruptedException
Syntax for wait() method
public final void wait() throws InterruptedException
Example
public class ThreadTest implements Runnable {
   private int number = 10;
   public void methodOne() throws Exception {
      synchronized(this) {
         number += 50;
         System.out.println("Number in methodOne(): " + number);
      }
   }
   public void methodTwo() throws Exception {
      synchronized(this) {
         Thread.sleep(2000); // calling sleep() method 
         this.wait(1000); // calling wait() method
         number *= 75;
         System.out.println("Number in methodTwo(): " + number);
      }
   }
   public void run() {
      try {
         methodOne();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void main(String[] args) throws Exception {
      ThreadTest threadTest = new ThreadTest();
      Thread thread = new Thread(threadTest);
      thread.start();
      threadTest.methodTwo();
   }
}
Output
Number in methodOne(): 60
Number in methodTwo(): 4500

	 */
}
