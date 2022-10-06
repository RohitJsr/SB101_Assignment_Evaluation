package com.masai.enum4;

public class Main {
	
	public static void main(String[] args) {
		Itrm[] itr= Itrm.values();
		
		for(Itrm i:itr) {
			i.info();
		}
	}
}
