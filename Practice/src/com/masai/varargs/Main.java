package com.masai.varargs;

public class Main {
	
	static void display(String... values) {
		System.out.println("display method invoked");
		
		for(String s1:values) {
			System.out.println(s1);
		}
	}
	public static void main(String[] args) {
		display();
		display("my","name","is","varargs");
		
	}

}
