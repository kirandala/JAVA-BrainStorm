package java_06_OOPs_class.classes2;

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

	public void setModel(String mode) { // this is nothing but the setter method in java
		String validmodel = mode.toLowerCase();
		if(validmodel.equals("model 1") || (validmodel.equals("model 2"))) {
			this.model = mode;
		}
		else model="unknow";
		
	}

	public String getModel() { // this is nothing but the getter method in java
		return this.model;
		
	}
}
