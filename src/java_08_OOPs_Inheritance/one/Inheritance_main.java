package java_08_OOPs_Inheritance.one;

/**
 * @author kiran dalai
 *
 */
public class Inheritance_main {

	// we are creating objects for animal and dog call here in this class
	
	public static void main(String[] args) {
		Inheritance_Animal ani = new Inheritance_Animal("Muffy", 1, 1, 3, 10);
		Inheritance_Dog dog = new Inheritance_Dog("browny", 4, 5, 2, 1, 32, "Hairy");
		Inheritance_fish fish=new Inheritance_fish("bubble",1,1,2,1000,4);

		// dog class will inherit all the methods from the animal class to verify lets
		// check if eat and move methods are available for the object dog
		dog.eat(); // animal class is called when no method available in dog class when eat method
					// is available in dog class the dog class method eat will be called when
					// super.eat() is available then super class method also will be called
		dog.move(10); // animal class is called when no method available in dog class
		System.out.println(" new ");
		dog.walk(); // during overriding first java looks for method available in child class if not
					// Available the goes to parent class
		
		fish.swim();

	}

}
