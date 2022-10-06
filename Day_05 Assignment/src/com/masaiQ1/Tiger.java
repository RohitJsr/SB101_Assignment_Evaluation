package com.masaiQ1;

public class Tiger extends Animal {

	public Tiger(AnimalException ae) {
		super(ae);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() throws AnimalException {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating !!");
    	
	}
	public static void main(String[] args) throws AnimalException {
		Animal ae= new Tiger(null);
		ae.eat();
		
	}

}
