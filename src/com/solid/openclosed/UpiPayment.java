package com.solid.openclosed;

public class UpiPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment through UPI.");
	}

}
