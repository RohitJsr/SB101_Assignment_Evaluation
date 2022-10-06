package com.masai.printabl;

public class Main implements Printable,Showable {
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hELLO");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("wELCome");
	}
	public static void main(String[] args) {
		Main obj= new Main();
		obj.print();
		obj.show();
		
		/*
		 wELCome
			hELLO

		 */
		
	}


}
