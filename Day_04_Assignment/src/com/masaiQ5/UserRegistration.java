package com.masaiQ5;

import java.util.Scanner;

public class UserRegistration {
	void registerUser(String username, String userCountry) throws InvalidCountryException{
		
		if(!userCountry.equals("India")){
			throw new InvalidCountryException ("User Outside India cannot be registered");
			
		}
		else {
			System.out.println("User registration done successfully");
			//System.out.println("Thanku you!");

		}
	}
	public static void main(String[] args) throws InvalidCountryException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");

		String userName = sc.nextLine();
		
		System.out.println("enter country");
		
		String country=sc.nextLine();
		
		UserRegistration ur= new UserRegistration();
		try {
		ur.registerUser(userName, country);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Thanku you!");

	}
	
	
	
	

}
