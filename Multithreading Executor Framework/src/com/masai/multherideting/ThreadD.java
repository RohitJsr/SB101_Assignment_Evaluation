package com.masai.multherideting;

public class ThreadD implements Runnable{

	@Override
	public void run() {
		for(int i=20;i<40;i++) {
			System.out.println("inside run of ThreadD "+i);
		}
	}
	public static void main(String[] args) {
		ThreadD t1= new ThreadD();
		Thread t= new Thread(t1);
		t.start();
		for(int i=20;i<40;i++) {
			System.out.println("Inside main of ThreadD "+i);
		}
	}

}
