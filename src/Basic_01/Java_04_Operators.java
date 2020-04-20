package Basic_01;

/**
 * @author kiran dalai
 *
 */
public class Java_04_Operators {

/* 
 * Operators in java are special symbols that perform operations on on ot more operands and return a result.
 * Operand is a term used to describe any object that is manipulated by an operator.
 *  "=" is assignment operator and is used to assign a value to left hand side variable.
 */	
	public static void main(String[] args) {
		int result =4+4; // 8
		System.out.println("Resut value after addition is "+ result);
		result =result-2; // 6 
		System.out.println("Resut value after substraction is "+ result);
		result =result/2; // 3 
		System.out.println("Resut value after division is "+ result);
		result =result%2; //  % will print reminder of result/2 =1
		System.out.println("Resut value after modulus is "+ result);
		
// result =result+1 can also be written as result++; this will add one t
		result=result+1;
		System.out.println("Resut value after adding 1 manually  is "+ result);
		result++;
		System.out.println("Resut value after increment  is "+ result);
		result +=2; // result =result +2 
		System.out.println("Resut value after incrementing 2  is "+ result);
		result *=2; // result =result*2 
		System.out.println("Resut value after mutipling 2  is "+ result);		
// We also have decrement operator similarly  
		result --; // result =result-1
		System.out.println("Resut value after decrementing 1  is "+ result);	
		if(result<=10) {
			System.out.println(" code is high");
		}
		else { System.out.println(" code is out of if statement ");
		}
	}

}
