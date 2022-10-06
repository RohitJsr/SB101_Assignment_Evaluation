package com.masaIQ3;

public class Calculate  extends Thread{
    int product = 1;
    @Override
    public void run() {

        synchronized (this){
            for(int i=1; i<=5; i++){
            	product = product*i;
            }
            this.notify();
        }
    }

    public static void main(String[] args) {
    	Calculate p1 = new Calculate();
        p1.start();

        synchronized (p1){
            try {
                p1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(p1.product);
    }

}
