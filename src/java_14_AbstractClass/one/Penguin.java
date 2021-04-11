package java_14_AbstractClass.one;

/**
 * @author kiran dalai
 *
 */
public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override // we have overridden as we need to put some specific functionality in birds
				// that is changed the penguins cannot fly
	public void fly() {
		// super.fly();
		System.out.println(getname() + ", I cannot fly but i can swim");
	}

	@Override
	public void eat() {

	}

	@Override
	public void breath() {

	}

}
