package com.masai.Intrstatic;

public class Main {
	public static void main(String[] args) {
		IntrImpl1 imp1= new IntrImpl1();
		
		imp1.method1();
		imp1.method2();
		
		Intr.method3();
		
		/*
		 inside method1 in intrImpl1
		Inside method2  by default
		Inside method3 of static
		 */
		
	}
}
