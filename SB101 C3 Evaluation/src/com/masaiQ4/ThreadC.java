package com.masaiQ4;

public class ThreadC  implements Runnable{
	int product=1;
	@Override
	public void run() {
	for(int i=1;i<=10;i++){
		product =product*i;
	String tname=Thread.currentThread().getName();
	System.out.println(tname +" is running "+product);
	}
	}
	}

