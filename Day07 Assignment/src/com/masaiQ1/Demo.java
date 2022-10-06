package com.masaiQ1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Product> pr=  new ArrayList<>();
		
		pr.add(new Product(1,"sao",100,40));
		pr.add(new Product(2,"rao",300,16));
		pr.add(new Product(3,"mao",300,40));
		pr.add(new Product(4,"jao",200,0));
		pr.add(new Product(8,"saii",333,33));
		
		   Collection<Product> col=pr.stream()
				   .filter(s->s.getQuantity()>10)
				   .collect(Collectors.toList());
		   
		   List<Product> sorted=new ArrayList<>(col);
		   Collections.sort(sorted,(p1,p2)->p1.getPrice()>p2.getPrice() ? +1:-1);
		
		   
			System.out.println("without sorted order");	   
//		 for(product item:col) {
//			 System.out.println(item);
//		 }
			
			col.forEach(s->System.out.println(s));
		 
		 System.out.println();
		 System.out.println("after sorted");
		 
		 for(Product item:sorted) {
			 System.out.println(item);
		 }
		
		
	}

}
