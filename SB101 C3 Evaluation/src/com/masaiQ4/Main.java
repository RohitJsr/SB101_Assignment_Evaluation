package com.masaiQ4;

public class Main {

	public static void main(String[] args) {
		ThreadA ta=new ThreadA();
		ThreadB tb=new ThreadB();
		ThreadC tc=new ThreadC();
		Thread t1=new Thread(ta);
		Thread t2=new Thread(tb);
		Thread t3=new Thread(tc);
		t1.setName("Kohli");
		t2.setName("Dhoni");
		t3.setName("Rohit");
		t1.start();
		t2.start();
		t3.start();
		
	}}
