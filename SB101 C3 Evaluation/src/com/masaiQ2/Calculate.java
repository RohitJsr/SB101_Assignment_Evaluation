package com.masaiQ2;

public class Calculate  extends Thread{
    int plus = 0;
    @Override
    public void run() {

        synchronized (this){
            for(int i=1; i<=10; i++){
            	plus = plus+i;
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
        System.out.println(p1.plus);
    }

}
