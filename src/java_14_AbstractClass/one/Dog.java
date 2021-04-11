package java_14_AbstractClass.one;

/**
 * @author kiran dalai
 *
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name);

	}

	@Override
	public void eat() {
		System.out.println(getname() + " is eating ");

	}

	@Override
	public void breath() {
		System.out.println(" breath in , breath out , repeat ");
	}

	
}
