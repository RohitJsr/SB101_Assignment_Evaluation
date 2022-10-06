package com.masaiQ4;

public class ThreadB  implements Runnable{
	int Add=0;
	@Override
	public void run() {
	for(int i=1;i<=20;i++){
		Add = Add+i;
		
	String tname=Thread.currentThread().getName();
	System.out.println(tname +" is running "+Add);
	}
	}
	}

