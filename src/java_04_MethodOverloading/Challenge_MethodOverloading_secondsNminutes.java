package java_04_MethodOverloading;

/**
 * @author kdalai1
 *
 */
public class Challenge_MethodOverloading_secondsNminutes {
	/*
	 * create a method called getDurationString with two parameters minutes and 2nd
	 * parameter seconds you should validate the first parameter is >=0. you should
	 * validate the second parameter is >=0 and <=59 Method should return
	 * "Invalid value" in the method if either above or not true if the parameters
	 * are valid then calculate how many hours minutes and seconds equal the minutes
	 * and seconds passed to his method return that value as string format
	 * "XXh YYm ZZs" where xx represents a number of hours, yy represents minutes
	 * and zz represents seconds
	 * 
	 * create the second method of the same name but with only one parameter second
	 * validate that it it >=0 and return "Invalid value" if it is not true
	 * 
	 * if it is valid,then calculate how many more minutes are in seconds value and
	 * then call the other overloaded method passing the correct minutes and seconds
	 * calculated so that it can calculate correctly. call both the methods
	 * 
	 * Method overloading means providing two or more separate methods in a class with the same name but different parameters
	 * Method return type may or may ot be different and that allows us to reuse the same method name.
	 * Overloading is very handy, it reduces duplicated code and we don't have to remember multiple method names 
	 * 
	 * Overloading does not have anything to do with polymorphism but java developers refer to overloading as compile time polymorphism 
	 * 
	 * in other words the compiler decided which method is method name return type and argument list.
	 * 
	 * Usually overloading happens inside a single class but a method can also be treated as overloaded in the subclass of that class
	 * thats because subclass inherits one version of the methods from the parent class and then the subclass can have another overloaded version of the methods
	 * 
	 * Rule while method overloading 
	 * 1.Method must have the same method name
	 * 2.Methods must have different parameters 
	 * 
	 * if methods follow the rules above then they may or may not 
	 * have different return types
	 * have different access modifiers 
	 * throw different checked or unchecked exceptions.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(getDurationString(120, 30));
		System.out.println(getDurationString(1456));

	}

	private static String getDurationString(int minutes, int seconds) {

		if ((minutes <= 0) || (seconds <= 0) || (seconds >= 59)) {
			return "Invalid value";
		}
		
		long hours = minutes / 60;
		long remainingminutes = minutes % 60;

		return hours + "h " + remainingminutes + "m " + seconds + "s";
	}

	private static String getDurationString(long seconds) {

		if ((seconds >= 0 && seconds >= 59)) {
			long minutes=seconds/60;
			long reminingmin=seconds%60;
			
			return minutes+"m "+reminingmin+" s";
		}
		return "Invalid value";
	}
}
