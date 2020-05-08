package java_08_OOPs_Inheritance.two;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * Challenge on Inheritance :
	 * 
	 * Start with a base class of a vehicle, then create a car class that inherits
	 * from this base class
	 * 
	 * Finally crate another class a specific type of car that inherits from the car
	 * class.
	 * 
	 * You should be able to hand steering, change gears, and moving (speed in other
	 * words).
	 * 
	 * You will want to decide where to put the appropriate state and
	 * behaviours(fields and methods). As mentioned above, changing gears
	 * increasing/decreasing speed should be included
	 * 
	 * For you specific type of vehicle you will want to add something specific for
	 * that type of car.
	 * 
	 */

	public static void main(String[] args) {
		Ford ford=new Ford(36);
		ford.accelerate(30);
		ford.accelerate(20);
		ford.steer(10);
	}

}
