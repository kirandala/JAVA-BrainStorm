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
