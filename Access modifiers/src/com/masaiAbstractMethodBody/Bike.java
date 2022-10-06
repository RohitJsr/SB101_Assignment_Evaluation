package com.masaiAbstractMethodBody;

abstract class Bike {
	 Bile(){
		System.out.println("Bike is created");
	}
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear changed");
	}
}
