package com.solid.dependencyinversion;

public class MySqlDatabase implements Database {

	@Override
	public void save(String data) {
		System.out.println("Saving data to MySql database : " + data);
	}

}
