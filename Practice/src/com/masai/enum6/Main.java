package com.masai.enum6;

public class Main {
	enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		Day day= Day.THRUSDAY;
		
		switch(day) {
		case SUNDAY:
		System.out.println("sunday");
		break;
		case TUESDAY:
		System.out.println("tUESDAY");
		break;
		case WEDNESDAY:
		System.out.println("wEDNESDAY");
		break;
		case THRUSDAY:
		System.out.println("tHRUSDAY");
		break;
		default:
			System.out.println("other day");
		}
		
	}
}
