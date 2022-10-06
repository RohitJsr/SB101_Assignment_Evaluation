package com.masaiQ1;

public class Test{
public static void main(String[] args)throws Exception {
MyThread mt=new MyThread();
mt.start();
synchronized (mt) { //getting the lock of mt object
System.out.println("main thread calls the wait method");
mt.wait();
System.out.println("main thread got the notification");
System.out.println(mt.num);
}
}
}