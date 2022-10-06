package com.masai.multherideting;

public class X extends Thread{

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println("Inside run method "+i);
		}
		System.out.println("end of run() method");
	}
	public static void main(String[] args) {
		X x1= new X();
		x1.run();
		x1.start();
		
		for(int i=25;i<60;i++) {
			System.out.println("indise main method "+i);
		}
		System.out.println("end of main()...");
	}
}
