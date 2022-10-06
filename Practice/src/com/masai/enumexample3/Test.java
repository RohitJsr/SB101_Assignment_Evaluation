package com.masai.enumexample3;

public class Test {

	enum Color{
		RED,
		GREENN,
		BLUE;
	}
	
	public static void main(String[] args) {
		Color arr[] = Color.values();
		for(Color col:arr) {
			System.out.println(col+"  at index  "+col.ordinal());
		}
		
	}
}
