package com.masai.Intr;

public interface Intr {
	void method();
	
	default void method2() {
		System.out.println("hello by default");
	}
}
