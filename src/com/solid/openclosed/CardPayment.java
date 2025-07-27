package com.solid.openclosed;

public class CardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment through card.");
	}

}
