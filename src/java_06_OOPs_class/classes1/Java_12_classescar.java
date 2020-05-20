package java_06_OOPs_class.classes1;

/**
 * @author kiran dalai
 *
 */
public class Java_12_classescar {

	/**
	 * Every object will have state and behaviors if we take objects as computer,
	 * keyboards,oven,Refrigerator State will be like the ram, screen if its ant how
	 * many legs, how many eyes, behavior might be booting up shutting down , print
	 * draw etc for ant eating walking fighting etc.. java program stores its state
	 * in fields variables and behaviors in methods So Class will be the template or
	 * blueprint to create objects
	 * 
	 * Class variables or fields are only accessible to class if its private
	 */

	private int doors; // class variable
	private int wheels;
	private String model;
	private String engine;
	private String color;
	// we are going to use these members from another class call main

	public void setModel(String mode) {
		this.model = mode;  // we are saying the private String initialized are same inside the method
		// this.model which is private as mode which is public as per the method declaration
		// this is nothing but the setter method in java
	}
	
	public String getModel() {
		return this.model; 
		// this is nothing but the getter method in java
	}
}
