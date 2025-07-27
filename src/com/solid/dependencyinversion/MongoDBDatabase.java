package com.solid.dependencyinversion;

public class MongoDBDatabase implements Database {

	@Override
	public void save(String data) {
		System.out.println("Saving data to Mongodb Database : " + data);
	}

}
