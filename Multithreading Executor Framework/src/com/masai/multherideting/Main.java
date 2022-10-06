package com.masai.multherideting;

public class Main {
	
	public static void main(String[] args) {
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		ThreadC t3= new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=70;i<80;i++) {
			System.out.println("inside  main of Test:"+i);
		}
		System.out.println("end of main");
	}

}
