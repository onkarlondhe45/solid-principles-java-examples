package com.solid.dependencyinversion;

public class UserService {

	private Database db;

	public UserService(Database db) {
		this.db = db;
	}

	public void addUser(String user) {
		db.save(user);
	}
}
