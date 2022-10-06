package com.masai.multherideting;

 class ThreadE implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			String tname= Thread.currentThread().getName();
			System.out.println(tname +" id running");
		}
	}

}
class ThreadF implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			String t1name= Thread.currentThread().getName();
			System.out.println(t1name +" id running ");
		}
	}
	
}
//public class Main{
//	
//	public static void main(String[] args) {
//		
//	}
//}
