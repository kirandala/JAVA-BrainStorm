package java_Challenges;

import java.util.Arrays;

/**
 * @author kiran dalai
 *
 */
public class Challenge_array_103_reverseArray {

	/**
	 * Write a method called reverse() array with an int array as a parameter
	 * the method should not return any value.In other words, the method is allowed to modify the array parameter.
	 * 
	 * int main() test the reverse() methods and print the array both reversed and no reversed.
	 * 
	 * to reverse the array  you have to swap the elements so that the first element is swapped with the last element and so on.
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
		int[] array= {1,4,2,6,12,26};
		System.out.println("array ="+ Arrays.toString(array));
		reverse(array);
		System.out.println("Revered array is "+ Arrays.toString(array));

	}
	
	private static void reverse(int[] array) {
		int maxindex= array.length-1;
		int halflength=array.length/2;
				
		for(int i=0;i<halflength;i++) {
			int temp= array[i];
			array[i]=array[maxindex-i];
			array[maxindex-i]=temp;

		}
	}
}
