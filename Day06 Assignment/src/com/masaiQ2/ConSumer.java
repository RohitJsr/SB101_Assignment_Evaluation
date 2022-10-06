package com.masaiQ2;

import java.util.function.Consumer;

public class ConSumer {
	
	public static void main(String[] args) {
		
		Consumer<Student> c=s->{
			System.out.println(s.getName());
			System.out.println(s.getMarks());
			System.out.println(s.getRoll());
		};
		c.accept(new Student(29,"manilal",880));
	}

}
