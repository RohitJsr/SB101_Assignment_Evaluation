package com.masaiQ2;

import java.util.function.Supplier;

import com.masaiQ1.Intr;

public class SuppiLer {
	
	public static void main(String[] args) {
		
		Supplier<Student> s=()->new Student(23,"Hiralal",90);
		
		System.out.println(s.get().getName());
	}
}
