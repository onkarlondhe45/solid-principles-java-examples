package com.solid.singleresponsibility;

//S - single responsibility principle - class should have only one responsibility. 
public class Client {

	public static void main(String[] args) {

		ReportGenerator reportGenerator = new ReportGenerator();
		reportGenerator.generator();

		ReportSaver reportSaver = new ReportSaver();
		reportSaver.saver();
	}

}
