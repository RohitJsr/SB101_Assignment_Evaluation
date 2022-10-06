package com.masai.Intrstatic;

public interface Intr {
	void method1();
	
	default void  method2() {
		System.out.println("Inside method2  by default");
	}
	
	static void method3() {
		System.out.println("Inside method3 of static");
	}
}
