package com.sapient.beans;

public class Bank implements Offline,Agent{

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}

	@Override
	public void getBalance() {
		System.out.println("gET bALANCE");
		
	}

	@Override
	public void clearPdc() {
		System.out.println("Clear PDC");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit");
		
	}
	
	

}
