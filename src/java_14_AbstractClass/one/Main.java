package java_14_AbstractClass.one;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/**
	 * Abstract classes cannot be instantiated, but they can be subclassed. If a
	 * class includes abstract methods, then the class itself must be declared
	 * abstract.
	 * 
	 * interfaces can have variables that are public static final but abstract
	 * classes can have variables.
	 * 
	 * interfaces cannot have constructors but abstract classes can have constructors 
	 */
	public static void main(String[] args) {
		Dog dog = new Dog("muffy");
		dog.breath();
		dog.eat();

//		Bird parrot=new Bird("parrot");  //if the bird class is not abstract and doesn't have abstract methods 
//		parrot.breath();
//		parrot.eat();

		Parrot machu = new Parrot("machu");
		machu.breath();
		machu.eat();
		machu.fly();

		Penguin pen = new Penguin(" bora");
		pen.breath();
		pen.fly();

	}

}
