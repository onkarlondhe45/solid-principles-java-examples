package com.solid.interfacesegregation;

//I- interface segregation principle - implement what we need, don't force classes to implement methods they don't need.
public class Client {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.work();
		
		Human human = new Human();
		human.work();
		human.eat();
	}
}
