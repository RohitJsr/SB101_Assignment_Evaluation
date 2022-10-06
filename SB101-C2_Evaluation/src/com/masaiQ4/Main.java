package com.masaiQ4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		   List<String> list=new ArrayList<String>();  
	       list.add("Rohan");
	       list.add("Mank");  
	       list.add("Ifan");  
	       list.add("Ji");  
	       list.add("Ankit");  
	       list.add("mayank");  
	       list.add("irfan");  
	       list.add("jai"); 
	       list.add("ankit");  
	       list.add("mayank");  
	       
	       
	       list.stream()
	       .filter(s -> s.length() %2==0)
	      .forEach(System.out::println);
	       
	       System.out.println("--------------------------------------------------------");
	         
	       list.stream()      
	       .filter(s -> s.length() %2==0).map(String::toUpperCase).collect(Collectors.toList())

           .forEach(System.out::println);
	       
	       
	       
	       
	       

	}
	
}
