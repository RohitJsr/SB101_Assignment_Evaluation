package com.masaiQ2;

public class ClassLockAndObjectLock {

	
	/*
	 Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
	Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances 
	on runtime. It should always be used to make static data thread safe. 
	
	Example of Class Level Lock
	public class ClassLevelLockExample {
	   public void classLevelLockMethod() {
	      synchronized (ClassLevelLockExample.class) {
	         //DO your stuff here
	      }
	   }
	}
	Example of Object Level Lock
	public class ObjectLevelLockExample {
	   public void objectLevelLockMethod() {
	      synchronized (this) {
	         //DO your stuff here
	      }
	   }
	}
	 */
	
}
