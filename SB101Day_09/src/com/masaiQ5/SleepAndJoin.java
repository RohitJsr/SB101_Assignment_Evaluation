package com.masaiQ5;

public class SleepAndJoin {
/*
 	. sleep() Method
This method causes the currently executing thread to sleep for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers. 

 Syntax:

//  sleep for the specified number of milliseconds
public static void sleep(long millis) throws InterruptedException

//sleep for the specified number of milliseconds plus nano seconds
public static void sleep(long millis, int nanos) 
                         throws InterruptedException

// Java program to illustrate
// sleep() method in Java
  
import java.lang.*;
  
public class SleepDemo implements Runnable {
    Thread t;
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(
                Thread.currentThread().getName() + "  "
                + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
  
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
  
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new SleepDemo());
  
        // call run() function
        t.start();
  
        Thread t2 = new Thread(new SleepDemo());
  
        // call run() function
        t2.start();
    }
}
Output
Thread-1  0
Thread-0  0
Thread-0  1
Thread-1  1
Thread-0  2
Thread-1  2
Thread-1  3
Thread-0  3
Note: 

Based on the requirement we can make a thread to be in a sleeping state for a specified period of time
Sleep() causes the thread to definitely stop executing for a given amount of time; if no other thread or process needs to be run, the CPU will be idle (and probably enter a power-saving mode).
3. join() Method
The join() method of a Thread instance is used to join the start of a thread’s execution to the end of another thread’s execution such that a thread does not start running until another thread ends. If join() is called on a Thread instance, the currently running thread will block until the Thread instance has finished executing. The join() method waits at most this many milliseconds for this thread to die. A timeout of 0 means to wait forever 

Syntax:

// waits for this thread to die.
public final void join() throws InterruptedException

// waits at most this much milliseconds for this thread to die
public final void join(long millis) 
              throws InterruptedException

// waits at most milliseconds plus nanoseconds for this thread to die.
The java.lang.Thread.join(long millis, int nanos)

// Java program to illustrate join() method in Java
  
import java.lang.*;
  
public class JoinDemo implements Runnable {
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "
                           + t.getName());
  
        // checks if current thread is alive
        System.out.println("Is Alive? " + t.isAlive());
    }
  
    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new JoinDemo());
        t.start();
  
        // Waits for 1000ms this thread to die.
        t.join(1000);
  
        System.out.println("\nJoining after 1000"
                           + " milliseconds: \n");
        System.out.println("Current thread: "
                           + t.getName());
  
        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
    
		    Output
		Current thread: Thread-0
		Is Alive? true
		
		Joining after 1000 milliseconds: 
		
		Current thread: Thread-0
		Is alive? false
    }
}
 */
}
