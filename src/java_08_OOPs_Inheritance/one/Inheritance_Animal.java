package java_08_OOPs_Inheritance.one;

/**
 * @author kiran dalai
 *
 */
public class Inheritance_Animal {

	/*
	 * Inheritance
	 */

	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;

	public Inheritance_Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal class");

	}

	public void move(int speed) {
		System.out.println("Animal Class ");
	}

	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
}
