package java_10_Arrays.arr01;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * Allows you to store a sequence of values simultaneously of same data types
	 * 
	 * An array is a data structure that allows you to store multiple values of the same type into a single variable
	 * 
	 * the default values of numeric array elements are set to zero.
	 * Arrays are zero indexed: an array with n elements is indexed from 0 to n-1 .
	 * 
	 * if we try to access index that is out of range java will give us an ArrayOutOfBoundsException, which indicates that the index is out of range in other words ou of bounds.
	 * 
	 * to access array elements we use the square braces[ and ] also know as array access operator.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] myvar; // initilize a variable for array
		myvar = new int[5]; // create an array of size 5

		// same can be done by int[] myvar= new int[5]; this is also same as above
		myvar[0] = 10;
		myvar[1] = 20;
		myvar[2] = 30;
		myvar[3] = 40;
		myvar[4] = 50;

		// we have added the values here now as above

		System.out.println(myvar[2]); // to print the array at index 0
		System.out.println(myvar);

		// null values will be printed if not assinged with any value

//		we can also assing all values as below without giving the size of array

		double[] myvar1 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("myvar1 value at 0th index is " + myvar1[0]);

		// print all values of int

		for (int i = 0; i <= 6; i++) {
			System.out.println("value at index " + i + " is " + myvar1[i]);
		}

		//we can assign values also to arrays using for loop lets see below how we do it 

		for (int i = 0; i <= 6; i++) {
			myvar1[i] = i * 10;
		}

		// to print again the array myvar1 and instead of hard coding the size of array we can get the size by a method 
		for (int i = 0; i < myvar1.length; i++) {
			System.out.println("value at index " + i + " is " + myvar1[i]);
		}
		
		
		
		
	}
}
