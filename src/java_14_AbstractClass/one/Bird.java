package java_14_AbstractClass.one;

/**
 * @author kiran dalai
 *
 */
public abstract class Bird extends Animal implements CanFly{
	private String name;

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {		
	}

	@Override
	public void breath() {
			
	}

	@Override
	public void fly() {
		System.out.println(getname()+ " can fly with wings");		
	}
	
	
}
