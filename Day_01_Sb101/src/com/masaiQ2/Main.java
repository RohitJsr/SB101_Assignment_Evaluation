package com.masaiQ2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Product pro=new Product();
			Scanner sc= new Scanner(System.in);
			System.out.println("How many Product you want to add");
			
			int num=sc.nextInt();
			
			int id=0;
			String name=null;
			int price=0;
			int count=0;
			
			
			PriorityQueue<Product> pr= new PriorityQueue<>(new ProductPriceComp());
			
			while(count<num){
				System.out.println("Enter product id:");
				
				id=sc.nextInt();
				
				System.out.println("Enter product name");
				
				name=sc.next();
				
				System.out.println("Enter product price");
				
				price=sc.nextInt();
			
				pr.add(new Product(id,name,price));
				count++;
			
			
			}
			
			Iterator<Product> itr=pr.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			

		}
}
