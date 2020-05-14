package java_12_Autoboxing;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/*
	 * we cannot create an array list with and primitive data type added as the type
	 */
	public static void main(String[] args) {
		String[] strarray = new String[5];
		int[] intarray = new int[6];

		ArrayList<String> stringarraylist = new ArrayList<>();
		// stringarraylist.add(strarray); // We are adding the array we have created
		// above here.
		stringarraylist.add("hello");

		// ArrayList<int> intarray=new ArrayList<>(); this is not possible becasue we
		// are passing an primitive data type
		ArrayList<intype> intclassarraylist = new ArrayList<>(); // here we are adding the class inttype as that is a
																	// class
		intclassarraylist.add(new intype(54));

		Integer integer = new Integer(50);
		Double doub = new Double(20.0);

		ArrayList<Integer> intarray1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			intarray1.add(Integer.valueOf(i)); // Autoboxing we are converting the primitive type to Integer
		}
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "-->" + intarray1.get(i).intValue()); // Autounboxing

		}
		// Integer myintvalue=56; this will be automatically handled by java as Integer
		Integer myintval = Integer.valueOf(56); // this will be called

		int myint = myintval; // its automatically doing this myintvalu.intvalue();

		ArrayList<Double> mydouble = new ArrayList<Double>();
		for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
			mydouble.add(Double.valueOf(dbl)); // Autoboxing
		}
		for (int i = 0; i < mydouble.size(); i++) {
			double value = mydouble.get(i).doubleValue(); // Auto Unboxing and it will run with even adding the
															// doublevalue method is called
			System.out.println(i + "-->" + value);

		}
	}
}

// Creating an wrapper class to access the objects of primitive data type int 
class intype {
	private int myval;

	public intype(int myval) {
		this.myval = myval;
	}

	public int getMyval() {
		return myval;
	}

	public void setMyval(int myval) {
		this.myval = myval;
	}

}