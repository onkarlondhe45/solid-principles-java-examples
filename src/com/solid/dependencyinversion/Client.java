package com.solid.dependencyinversion;

//D - dependency inversion principle. high level module should be depends on abstraction not concrete classes.
public class Client {

	public static void main(String[] args) {

		MySqlDatabase mySqlDatabase = new MySqlDatabase();
		UserService userService = new UserService(mySqlDatabase);
		userService.addUser("Onkar Londhe");
		
		MongoDBDatabase mongoDBDatabase = new MongoDBDatabase();
		UserService userService2 = new UserService(mongoDBDatabase);
		userService2.addUser("Balasaheb Patekar");
	}
}
