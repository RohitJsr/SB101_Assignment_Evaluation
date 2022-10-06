package com.masaiQ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Student> pd= new ArrayList<>();

	pd.add(new Student(1,"Madhav",560,"Delhi"));
	pd.add(new Student(2,"Jagdish",360,"Mumbai"));
	pd.add(new Student(3,"Shyam",660,"Gugrat"));
	pd.add(new Student(4,"KripaNidhan",560,"Banaras"));
	pd.add(new Student(5,"Gagnath",680,"Puri"));


	for(Student item:pd) {
		System.out.println(item);
	}

	System.out.println("-------------------------------------------------");
	

Collections.sort(pd,(s1,s2)->s1.getMarks()>500?-1:1);

for(Student item:pd) {
   System.out.println(item);
}

}
}
