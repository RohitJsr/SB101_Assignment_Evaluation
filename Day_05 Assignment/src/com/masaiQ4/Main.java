package com.masaiQ4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main implements PrintList {

	@Override
	public void display(List<String> city) {
		// TODO Auto-generated method stub
		
		
		System.out.println(city);
		
	}
	public static void main(String[] args) {
		PrintList p1=(city)->{
			for(String s:city) {
				System.out.println(s);
			}
			Collections.sort(city,(s1,s2)->s1.compareTo(s2)>1?1:-1);
			System.out.println(city);
		};
		
	List<String> city=Arrays.asList("mango","adityapur","sakchi","jamshedpur");
	p1.display(city);
}

}
