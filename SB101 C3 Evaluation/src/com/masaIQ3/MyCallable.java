package com.masaIQ3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
	int num;
	public MyCallable(int num) {
	this.num = num;
	}
	@Override
	public Object call() throws Exception {
	System.out.println(Thread.currentThread().getName()+" .. is responsible to find the sum of first "+num+" numbers");
	int product=1;
	for(int i=0;i<=num;i++){
		product = product*i;
	}
	return product;
	}
	}
