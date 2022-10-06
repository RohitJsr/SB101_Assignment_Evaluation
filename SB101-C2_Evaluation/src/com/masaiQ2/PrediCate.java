package com.masaiQ2;

import java.util.function.Predicate;

public class PrediCate implements Predicate<Integer>{

		Student s1= new Student();
	@Override
	public boolean test(Integer t) {
		boolean result=s1.getMarks()<500;
		return result;
	}

}
