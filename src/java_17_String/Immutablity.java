
package java_17_String;

/**
 * @author kiran dalai
 *
 */
public class Immutablity {
	public static void main(String[] args) {
		String s1 = "kiran";
		String s2 = "kiran";

		String s3 = new String("kiran");
		String s4 = new String("kiran");

		System.out.println("s1 == s2");
		System.out.println(s1 == s2); // true
		System.out.println("s1 == s3");
		System.out.println(s1 == s3); // false this is because == is comparing the address locations if they are same
										// true

		System.out.println("using .equals");
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));

		s2 = "kumar";
		System.out.println("after changing s2 to new string");
		System.out.println(s1 == s2); // false

		String s5 = "Kiran";
		System.out.println(" After creating new literal s5 ");

		System.out.println(s1 == s5); // false
		System.out.println(s1.equals(s5)); // fase
		System.out.println(s1.equalsIgnoreCase(s5));// true
		System.out.println(s1.length());

	}

}
