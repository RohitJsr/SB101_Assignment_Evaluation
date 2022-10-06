package com.masaiYourProblem;

public class BankDemo {
	public static void main(String[] args) {
		Bank b1= new Sbi();
		Bank p1= new Pnb();
		Bank i1= new Icici();

		System.out.println("Rate of interest of pnb is  "+p1.getRateOfInterest()+"%");
	
	}
}
