package com.masai.printable;

public class Demo implements Printable, Showable {
	
	
	@Override
	public void show() {
		System.out.println("Hello show()");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome print()");
		
	}

	public static void main(String[] args) {
		
		Demo d1= new Demo();
		d1.show();
		d1.print();
		
		Printable p1= new Demo();
		p1.print();
		
		Showable p2= new  Demo();
		p2.show();
		
		/*
		 Hello show()
		Welcome print()
		Welcome print()
		Hello show()

		 */
		
	}


}
