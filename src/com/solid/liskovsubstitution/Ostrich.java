package com.solid.liskovsubstitution;

public class Ostrich implements Bird {

	@Override
	public void eat() {
		System.out.println("Ostrich is eating...!");
	}
}
