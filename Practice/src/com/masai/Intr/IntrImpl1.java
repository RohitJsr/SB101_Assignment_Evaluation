package com.masai.Intr;

public class IntrImpl1 implements Intr {

	@Override
	public void method() {
		System.out.println("Indide method of IntrImpl1");
		
	}
	public static void main(String[] args) {
		
		IntrImpl1 i1= new IntrImpl1();
		
		i1.method();
		i1.method2();
	}

	/*
	 	Indide method of IntrImpl1
		hello by default

	 */
}
