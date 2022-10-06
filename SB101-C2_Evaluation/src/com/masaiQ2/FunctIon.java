package com.masaiQ2;

import java.util.function.Function;

public class FunctIon {

	public static void main(String[] args) {
		Function<Student,Integer> fun= s->s.getMarks();

		System.out.println(fun.apply(new Student(23,"mahi",900)));
	}

}
