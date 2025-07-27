package com.solid.liskovsubstitution;

//L- liskov substitution principle - subclasses should be replaceable by base classes without breaking functionality.
public class Client {

	public static void main(String[] args) {

		Sparrow sparrow = new Sparrow();
		sparrow.fly();
		sparrow.eat();

		Ostrich ostrich = new Ostrich();
		ostrich.eat();
	}
}
