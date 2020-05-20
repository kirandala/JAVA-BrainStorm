package java_08_OOPs_Inheritance.two;

/**
 * @author kiran dalai
 *
 */
public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentgear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
	}

	public void setCurrentgear(int currentgear) {
		this.currentgear = currentgear;
		System.out.println("Car.set current gear() changed to "+ this.currentgear+ " gear");
	}
	public void changevelocity(int speed,int direction) {
		move(speed,direction);
		System.out.println("Car.changevelocity() velocity "+ speed+ " direciton  "+ direction);
	}
	

}
