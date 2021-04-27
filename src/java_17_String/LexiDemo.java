package java_17_String;

/**
 * @author kiran dalai
 *
 */
public class LexiDemo {
	public static void main(String args[]) {
		String str1 = "z";
		String str2 = "a";
		String str3 = "z";

		int x = str1.compareTo(str3);
		System.out.println("str1.compareTo(str3): " + x); // the difference of 112-122 = 0
		int y = str1.compareTo(str2);
		System.out.println("str1.compareTo(str2): " + y); // the difference of z-a, 122-97 = 25

		System.out.println("str2.compareTo(str1): " + str2.compareTo(str1)); // the difference of a-z, 97-122 = -25

		System.out.println("lord and Lord: " + "the lord".compareTo("the Lord")); // the difference of l-L, where
																					// mismatch occurs, 108-76 = 32
		System.out.println("ASCII value of z: " + (int) 'z');
		System.out.println("ASCII value of a: " + (int) 'a');
		System.out.println("ASCII value of l: " + (int) 'l');
		System.out.println("ASCII value of L: " + (int) 'L');
	}
}
