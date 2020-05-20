package java_09_OOPs_Polymorphism.two;

/**
 * @author kiran dalai
 *
 */

class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;

	}

	public String getName() {
		return name;
	}

	public String brake() {
		return "Car class Break methods";
	}

	public String startengine() {
		return "Car --> startengine";
	}

	public String accelarate() {
		return "accelarate--> Car class";
	}

	public int getCylinders() {
		return cylinders;
	}

}
class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String brake() {
		return "accelarate--> Ford class";
	}

	@Override
	public String startengine() {
		return "accelarate--> Ford class";
	}

	@Override
	public String accelarate() {
		return "accelarate--> Ford class";
	}
	
	
}
class Maruti extends Car {

	public Maruti(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String brake() {
		return "accelarate--> Maruti class";
	}

	@Override
	public String startengine() {
		return "accelarate--> Maruti class";
	}

	@Override
	public String accelarate() {
		return "accelarate-"+ getClass().getSimpleName(); 
	}
	
	
}
public class Main {

	/*
	 * Create a base class Class Car it should have a few fields that would be
	 * appropriate for a generic car class. Engine cylinders,wheels etc. Constructor
	 * should initialize cylinder(number of ) and name and set wheels to 4 and
	 * engine to true, Cylinders and name woild be passed paramenters
	 * 
	 * Create appropriate getters create some methods like start engine accelerate
	 * and brake
	 * 
	 * show a message for each in the base class . now create 3 sub class for your
	 * favourite vehicles . override the appropriate methods to demonstrate
	 * polymorhphism in use. put all classed in one java file.
	 * 
	 */
	public static void main(String [] args) {
		Car car=new Car(4,"Munstang");
		System.out.println(car.startengine());
		System.out.println(car.accelarate());
		System.out.println(car.brake());
		
		Ford ford=new Ford(4,"Aspire");
		System.out.println(ford.startengine());
		System.out.println(ford.accelarate());
		System.out.println(ford.brake());
		
		Maruti Maruti=new Maruti(4,"swift");
		System.out.println(Maruti.startengine());
		System.out.println(Maruti.accelarate());
		System.out.println(Maruti.brake());
		
	}
}
