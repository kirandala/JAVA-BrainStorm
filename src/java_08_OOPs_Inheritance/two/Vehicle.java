package java_08_OOPs_Inheritance.two;

/**
 * @author kirandalai
 *
 */
public class Vehicle {

	private String name;
	private String size;

	private int currentvelocity;
	private int currentdirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentdirection = 0;
		this.currentvelocity = 0;
	}

	public void steer(int direction) {
		this.currentdirection = direction;
		System.out.println("Vehicle. steer() at " + currentdirection + "degress");

	}

	public void move(int velocity, int direction) {
		currentvelocity = velocity;
		currentdirection = direction;
		System.out.println("vehicle.move()  at " + currentvelocity + " in direction " + currentdirection);
	}
	
	public void stop() {
		this.currentdirection=0;
	}
	String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentvelocity() {
		return currentvelocity;
	}

	public int getCurrentdirection() {
		return currentdirection;
	}

}
