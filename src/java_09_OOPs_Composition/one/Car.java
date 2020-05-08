package java_09_OOPs_Composition.one;

/**
 * @author kiran dalai
 *
 */
public class Car extends Vehicle {

	// car extends vehicle it means car is a relationship with vehicle
	// composition deals with has a relationship ,computer has a motherboard but
	// motherboard don't have computer ... similarly vehicle has car

	private int doors;
	private int enginecapacity;

	public Car(String name, int doors, int enginecapacity) {
		super(name);
		this.doors = doors;
		this.enginecapacity = enginecapacity;
	}

}
