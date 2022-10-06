package com.masaiQ2;

import java.util.function.Supplier;

public class SuppLier {

	public static void main(String[] args) {

		Supplier<Student> s=()->new Student(23,"Hiralal",90);

		
		System.out.println(s.get().getName());
		System.out.println(s.get().getMarks());
		System.out.println(s.get().getRoll());
	}
}
