
package java_08_OOPs_Inheritance.one;

/**
 * @author kiran dalai
 *
 */
public class Inheritance_Dog extends Inheritance_Animal {
	/*
	 * Since dog also belong to animal class we have extended so that the properties
	 * of animal will be available for dog as well and Dog also will have some extra
	 * characteristics so we can add them by creating new methods in the dog class
	 */
	private int eyes;
	private int tail;
	private int teeth;
	private String skincoat;

	public Inheritance_Dog(String name, int size, int weight, int eyes, int tail, int teeth, String skincoat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.tail = tail;
		this.teeth = teeth;
		this.skincoat = skincoat;

	}

	private void chew() {
		System.out.println("dog chews food");
	}

	@Override // this to tell that it has overridden from parent class
	public void eat() {
		System.out.println("dog class called");
		super.eat(); // the parent class method will be called
		chew(); // dog class method will be called
	}

	public void walk() {
		System.out.println("dog class walk called");
		move(10); // we can direclty call like this as move or we can user super.move(10) works
					// anyways same
	}

	public void run() {
		System.out.println("dog class run called");
	}

	// Dog will have new characteristics like eyes but not all animals do have eyes
	// and tail so we have added in the dog class
	// the below constructor can be created automatically by calling the constructor
	// public Inheritance_Dog(String name, int brain, int body, int size, int
	// weight) {
	// super(name, brain, body, size, weight);
	// super here means we are calling the constructed for the class we are
	// extending from.
	// }

	// We can also override the methods we can have the same method name and same
	// Function that is available in parent class called animal in our case and java
	// allows to override that method.

}
