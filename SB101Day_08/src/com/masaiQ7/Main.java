package com.masaiQ7;

public class Main {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}


}
