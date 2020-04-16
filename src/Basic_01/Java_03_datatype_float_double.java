package Basic_01;
/**
 * @author kirandalai
 *
 */
public class Java_03_datatype_float_double {
	/* floating point number have decimeal points and we need to add floating point number incase we need precision
	 * precision refers to the format and amount of space occupied by the type. single precision(float) occupies 32 bits(So has width of 32) 
	 * and double(double type) precision occupies 64 bits.
	*/
	public static void main(String[] args) {
		float floatminval=Float.MIN_VALUE;
		float floatmaxval=Float.MAX_VALUE;
		System.out.println("Minimum value of float is "+floatminval); 
		System.out.println("Maximmum value of float is "+ floatmaxval); 
		
		// double max and min values 
		double doubleminval=Double.MIN_VALUE;
		double doublemaxval=Double.MAX_VALUE;
		System.out.println("Minimum value of double is "+doubleminval); 
		System.out.println("Maximmum value of double is "+ doublemaxval); 
		
		// good practise is to 
		int intval=2;
		float floatval=5f;
		double doubleval=5.25d;
		System.out.println("int value"+ intval);
		System.out.println("float value"+ floatval);
		System.out.println("Double value"+ doubleval);
		intval=2/2;
		floatval=5f/2f;
		doubleval=5.25d/2d;
		System.out.println("int value after division "+ intval);
		System.out.println("float value after division "+ floatval);
		System.out.println("Double value after division "+ doubleval);
		// casting float type 
		floatval=(float)5.25d;
		
/* 
 * In general float and double are great for general floating point operations but none are great to use where precise calculations are required
 * this is ude to a limitation with how floating point number are stored and not a java problem
 * 
 * java has a call call BigDecimal that overcomes this problem.*/		
		
		
		
		

	}

}
