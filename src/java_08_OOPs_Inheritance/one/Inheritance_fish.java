package java_08_OOPs_Inheritance.one;

/**
 * @author kiran dalai
 *
 */
public class Inheritance_fish extends Inheritance_Animal {

	private int gills;
	private int eyes;
	private int fins;

	// when the constructor is called for fields in this class automatically the
	// parent class constructor parameters are also called here

	public Inheritance_fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	private void rest() {
		System.out.println("Fish class rest called");
	}
	private void movemuscles() {
		System.out.println(" fish move muscles called ");
	}
	private void movebackfin() {
		System.out.println("fish movebackfin");
	}
	public void swim() {
		System.out.println("fish class swim called");
		movemuscles();
		movebackfin();
	}
}
