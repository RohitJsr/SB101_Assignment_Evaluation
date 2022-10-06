package com.masaiQ3;

public class CardPayment implements Payment{
  private int amount;

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Card "+amount);
	}
	
	private CardPayment(int amount) {
	super();
	this.amount = amount;
}

}
