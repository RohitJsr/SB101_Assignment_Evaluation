package com.masaiQ3;

public class CashPayment implements Payment {
	private int amount;

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println( "Payment done using Cash "+amount);
		
	}

	private CashPayment(int amount) {
		super();
		this.amount = amount;
	}

}
