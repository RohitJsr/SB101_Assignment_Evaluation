package com.masaiQ2;

import java.util.function.Function;

public class FunCtion {

	public static void main(String[] args) {
		Function<Student,String> fun= s->"Wlcome "+s.getName().toUpperCase();
		
		System.out.println(fun.apply(new Student(23,"mahi",900)));
	}
}
