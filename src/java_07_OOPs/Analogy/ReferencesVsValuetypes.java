package java_07_OOPs.Analogy;

import java.util.Arrays;

/**
 * @author kiran dalai
 *
 */
public class ReferencesVsValuetypes {

	public static void main(String[] args) {
		int myval = 10;
		int myval1 = myval;

		System.out.println("myval = " + myval);
		System.out.println("myval1 = " + myval1);

		myval1++;

		System.out.println("\r  myval = " + myval);
		System.out.println("myval1 = " + myval1);

		int[] myarray = new int[5]; // a reference will hold the reference but not the object itself
		int[] myarray1 = myarray; // this is also an reference and points to same address this can be found by the
									// new operator here we don't have new operator so we are referencing something
		System.out.println("my array " + Arrays.toString(myarray));
		System.out.println("my array 1 " + Arrays.toString(myarray1));

		myarray1[0] = 1;

		System.out.println("my array " + Arrays.toString(myarray));
		System.out.println("my array 1 " + Arrays.toString(myarray1));
		// since both variables are referencing the same array in the memory same thing happens even for methods
		
		modifyarray(myarray);
		System.out.println("my array  after runnig the modifed array " + Arrays.toString(myarray));
		System.out.println("my array 1 after runnig the modifed array " + Arrays.toString(myarray1));
		
		// if i change the code to 
		myarray1=new int[] {5,4,3,2,1};
		System.out.println("my array  after runnig the modifed array " + Arrays.toString(myarray));
		System.out.println("my array 1 after runnig the modifed array " + Arrays.toString(myarray1));
	}
	private static void modifyarray(int[] array) {
		array[2]=2;
		
		array=new int[] {1,2,3,4,5}; // this will point to a new array with reference 12345 
 	}
	
	
}
