package com.solid.interfacesegregation;

public class Robot implements Workable {

	@Override
	public void work() {
		System.out.println("Robot is working on task.");
	}

}
