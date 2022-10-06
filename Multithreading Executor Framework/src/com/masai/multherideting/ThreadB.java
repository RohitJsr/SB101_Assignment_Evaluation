package com.masai.multherideting;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
	
		for(int i=50;i<60;i++) {
			System.out.println("inside run method of ThreadB "+i);
		}
		System.out.println("end of ThreadB");
	}
}
