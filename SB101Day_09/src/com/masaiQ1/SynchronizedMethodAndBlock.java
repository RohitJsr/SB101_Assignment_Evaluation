package com.masaiQ1;

public class SynchronizedMethodAndBlock {
/*
 
 Multithreading Example without Synchronization
Here is a simple example which may or may not print counter value in sequence and every time we run it, it produces a different result based on CPU availability to a thread.

Example
 Live Demo

class PrintDemo extends Thread {
   public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter --- " + i );
         }
      } catch (Exception e) {
         System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
      }
   }
   public void run() {
      printCount();
      System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
   }
}
public class TestThread {
   public static void main(String args[]) {
      PrintDemo PD = new PrintDemo();
      Thread t1 = new Thread(PD );
      Thread t2 = new Thread(PD );
      t1.start();
      t2.start();
      // wait for threads to end
      try {
         t1.join();
         t2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}



-------------------------------------------------------------------------
Multithreading Example with Synchronization at Block level
Here is the same example which prints counter value in sequence and every time we run it, it produces the same result. W've put synchronized keyword over a block so that counter increment code is now locked as per the object during method execution. We're using current object as lock which we're passing in the synchronized block as parameter.

Example
 Live Demo

class PrintDemo extends Thread {
   public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter --- " + i );
         }
      } catch (Exception e) {
         System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
      }
   }
   public void run() {
      synchronized(this) {
         printCount();
      }
      System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
   }
}
public class TestThread {
   public static void main(String args[]) {
      PrintDemo PD = new PrintDemo();
      Thread t1 = new Thread(PD );
      Thread t2 = new Thread(PD );
      t1.start();
      t2.start();
      // wait for threads to end
      try {
         t1.join();
         t2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}
 */
}
