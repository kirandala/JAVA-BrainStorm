package java_01_helloWorld;

/**
 * @author kirandalai
 *
 */
public class Java_03_datatypes {
	/*
	 * Java 8 primitive types: byte,short,int,long,char.boolean ,float and
	 * double(building blocks of data manipulation ) >less data type will take less
	 * space and will execute faster > A byte occupies 8 bits. A bit is not directly
	 * represented in Primitive type. > short 16 bits, int 32 bits and long of 64
	 * bits We should understand that different data types occupies different values
	 * .
	 */
	public static void main(String[] args) {

		int value = 100;
		// showing the range of int
		int intminval = Integer.MIN_VALUE;
		int intmaxval = Integer.MAX_VALUE;
		System.out.println("Minimum value of int is " + intminval);
		System.out.println("Maximmum value of int is " + intmaxval);
		System.out.println("Overflow of int " + (intmaxval + 1)); // will print the -2147483648
		System.out.println("Underflow of int " + (intminval - 1)); // will print the 2147483647
		// int maxvalueforint= 2147483648; this will show an error in the ide when we
		// remove the comment coz value is out of range
		value = 21_47_483_647;
		System.out.println("value is accepted when given as 21_47_483_647  " + value);
		// Java uses a concept of wrapper class for all 8 primitive types so here its
		// Integer we can perform actions with primitives
		// Short max and min value

		int shortminval = Short.MIN_VALUE;
		int shortmaxval = Short.MAX_VALUE;
		System.out.println("Minimum value of int is " + shortminval); // -32768
		System.out.println("Maximmum value of int is " + shortmaxval); // 32767

		// byte max and min value
		short byteminval = Byte.MIN_VALUE;
		short bytemaxval = Byte.MAX_VALUE;
		System.out.println("Minimum value of short is " + byteminval); // -128
		System.out.println("Maximmum value of short is " + bytemaxval); // 127

		// Long
		long longminval = Long.MIN_VALUE;
		long longmaxval = Long.MAX_VALUE;
		long longvaluetoprint = 100l;
		System.out.println("Minimum value of long is " + longminval); // -9223372036854775808
		System.out.println("Maximmum value of long is " + longmaxval); // 9223372036854775807
		System.out.println("Value of long printed is " + longvaluetoprint);

		// Casting
		value = (value / 2);
		// byte newbyteval=(byteminval/2); the error is coz java is considering the
		// value between () as a int value
		// Casting means to treat or convert a number from one type to another we do by
		// : (byte)(byteminval/2)
		short mynewshourtvalue = (short) (shortminval / 2);
		System.out.println("printing short value after casting " + mynewshourtvalue);

	}

}
