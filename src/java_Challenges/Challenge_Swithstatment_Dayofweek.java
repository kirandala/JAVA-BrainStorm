package java_Challenges;

/**
 * @author kiran dalai
 *
 */
public class Challenge_Swithstatment_Dayofweek {
	/*
	 * Write a method with name as printDayOfTheWeek that has one promenader of type
	 * int and name it day Method should not return any value Using a switch
	 * Statement print "Sunday, "Monday","Saturday " if the int parament day is 0
	 * 1234 .. .6 respectively , else it should print invalid day.
	 */
	public static void main(String[] args) {
		printDayOfTheWeek(2);
		printDayOfTheWeek(1);
		printDayOfTheWeek(8);
	}

	private static void printDayOfTheWeek(int day) {
		if (day < 6 || day > 0) {
			switch (day) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("Wednesday");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
				break;

			}
		}

	}
}
