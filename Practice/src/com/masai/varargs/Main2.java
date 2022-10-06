package com.masai.varargs;

public class Main2 {
	
	static void display(int num,String... value) {
		System.out.println("number is "+num);
	
	   for(String s:value) {
		   System.out.println(s);
	   }
	}
	
	public static void main(String[] args) {
		display(200);
		display(200,"Hello");
		display(100,"my","name","is","varargs");
	}
}
