package com.github.mhilker.example;

/**
 * The main class of this application.
 */
public class ExampleApplication {
	
	/**
	 * Startup the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleApplication project = new ExampleApplication();
		project.run();
		System.exit(0);
	}
	
	/**
	 * Print the "Hello World" message.
	 */
	public void run() {
		System.out.println("Hello World.");
	}
}
