package com.masaiQ3;

public class ThreadB extends Thread {
	
	ThreadA tr;
	public ThreadB(ThreadA tr) {
		this.tr=tr;
	
	}
	@Override
	public void run() {
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.println("Odd number "+i);
			}
		}
	}

}
