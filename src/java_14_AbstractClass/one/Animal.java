package java_14_AbstractClass.one;

/**
 * @author kiran dalai
 *
 */
public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	public abstract void eat();  // we have not impemented yet 
	public abstract void breath();
	
	public String getname() {  // We are actually forcing the main class to implements these methods
		return name;
	}
	
	
}
