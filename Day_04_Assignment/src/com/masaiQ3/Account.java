package com.masaiQ3;

public class Account {
	private String accountNumber;
	 private double balance;
	
	public void deposit(double amount) {
		this.balance=balance+amount;
	}

	
	public double withdraw(double amount)throws Exception {
	
				if(amount> balance) {
					throw new Exception("Insuficient fund error");
				}
				else {
					this.balance=balance+amount;
					return amount;
				}
		
		}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public Account() {
		super();
	}



	
	}
