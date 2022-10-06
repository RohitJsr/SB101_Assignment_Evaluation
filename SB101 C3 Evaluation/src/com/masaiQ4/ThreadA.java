package com.masaiQ4;

public class ThreadA implements Runnable{
	
		@Override
		public void run() {
		for(int i=1;i<=10;i++){
		String tname=Thread.currentThread().getName();
		System.out.println(tname +" is running " +i);
		}
	}
	}
