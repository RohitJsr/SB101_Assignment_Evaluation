package com.masaiQ5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
    public static void main(String[] args) {
		
    	List<Product> pd= new ArrayList<>();
    	
    	pd.add(new Product(1,"oil",1,500));
    	pd.add(new Product(5,"soap",2,800));
    	pd.add(new Product(3,"sampoo",3,400));
    	pd.add(new Product(2,"ghee",1,700));
    	pd.add(new Product(8,"souce",1,500));
    	pd.add(new Product(9,"po",1,506));
    	
    	for(Product item:pd) {
    		System.out.println(item);
    	}
    	
    	System.out.println("-------------------------------------------------");
    	
   Collections.sort(pd,(s1,s2)->s1.getPrice()>s2.getPrice()?-1:1);
   
   for(Product item:pd) {
	   System.out.println(item);
   }
    	
    	
    	
    	
	}
}
