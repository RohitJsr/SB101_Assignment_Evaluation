package com.masaiQ4;

public class RaceCondition {

	/*
	 
	 Race condition happens when two or more threads
	  are accessing a shared resource and modifying it. As the order in which they access and 
	  modify it is unknown, the output is ambiguous. It can be avoided by using Mutex or Semaphores upon critical sections.

		Example :
		Thread 1 :
		
		while(1) 
		{ 
		  n++; 
		  if( n == 10 ) 
		    print(n); 
		} 
		
		Thread 2 :
		
		while(1) 
		{ 
		  n--; 
		} 
		
		In Thread 1, after entering the if condition, there might be a chance Thread 2 has modified the value of n. Thus there is ambiguity in the output.
		Also we must realize that each "n++" or "n--" is three instructions internally : Load, Increment/Decrement, Store.
		There might be a case as where a thread might load n, while it is being incremented in another thread but not yet stored back.
	 */
}
