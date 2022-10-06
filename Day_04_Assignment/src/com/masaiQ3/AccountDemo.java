package com.masaiQ3;

import java.util.Scanner;

public class AccountDemo {
   public static void main(String[] args) throws Exception {
	 Scanner sc= new Scanner(System.in);
	   Account ac= new Account("22222",500);
	
	   while(true) {
		   System.out.println("Want deposit Yes/No");
		   
		   String s= sc.next();
		   
		   if(s.equalsIgnoreCase("Yes")) {
			   System.out.println("Enter amount for deposit");
			   double amount= sc.nextDouble();
			   ac.deposit(amount);
			   break;
		   }
		   else {
			   break;
		   }
	   }
	   
	   while(true) {
		   System.out.println("Want to withdreaw Yes/No");
		   String s1= sc.next();
		   
		   if(s1.equalsIgnoreCase("Yes")) {
			   System.out.println("Enter amount to withdraw");
			   double amount1= sc.nextDouble();
			   try {
				   double withd=ac.withdraw(amount1);
				   System.out.println("withdraw amount  "+withd);
				   System.out.println("Remaning balance is account  "+ac.getBalance());
				   break;
			   }
			   catch (Exception e){
					System.out.println(e.getMessage());
					break;
				   }
			   }
		   else {
			   break;
		   }
	   }
	   System.out.println("ThankYou!");
}
}
