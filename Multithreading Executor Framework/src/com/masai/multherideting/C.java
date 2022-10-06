package com.masai.multherideting;

public class C implements Runnable {

	@Override
	public void run() {
		System.out.println("override runnable interface");
		
	}
	
	public void start() {
		System.out.println("This is thread vlass own method");
	}

}
