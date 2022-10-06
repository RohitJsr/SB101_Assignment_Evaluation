package com.masaiQ1;

public class MyThread extends Thread{
int num=0;
@Override
public void run() {
synchronized (this) {
System.out.println("child thread performing calculation");
for(int i=1;i<=10;i++){
num=num+i;
}
System.out.println("child thread giving the notification");
this.notify();
}
}
}
