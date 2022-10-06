package com.masaiQ3;

public class Main implements X{
	public int convetStringToNumber(String s) {
		int num= Integer.parseInt(s);
		return num;
		
	}
	
	public static void main(String[] args) {
		
		X x= new Main();
		int solution =x.convetStringToNumber("1587");
		System.out.println(solution);
	}

}
