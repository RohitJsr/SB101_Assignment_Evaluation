package com.masaiQ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class City {
	
	public static void main(String[] args) {
		
		List<String> name= new ArrayList<>();
	
			name.add("A");
			name.add("B");
			name.add("C");
			name.add("J");
			name.add("G");
			
			
			Collections.sort(name,(s1,s2)->s1.compareTo(s2)>1?1:-1);
			System.out.println(name);
			}
}


