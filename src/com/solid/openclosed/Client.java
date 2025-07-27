package com.solid.openclosed;

//o - class should be open for extension but close for modification.
public class Client {

	public static void main(String[] args) {

		Payment upiPayment = new UpiPayment();
		upiPayment.pay();

		Payment cardPayment = new CardPayment();
		cardPayment.pay();
	}
}
