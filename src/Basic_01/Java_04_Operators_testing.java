package Basic_01;
/**
 * @author kirandalai
 *
 */
public class Java_04_Operators_testing {
/* problem :
 * Create a double variable with value 20
 * create second variable with double value 80.00
 * add both numbers and muliply by 100
 * use the remainder operator to figure out what the remainder for the result of the opration in stpe 3 and 40.00 .
 * create a boolean variable that assings the value true if the remainder is #4 is 0, or false if its not zero.
 * output the bolean variable 
 * write as if-the statment that displays a message "got some remainder" if the boolean in step 5 is not true.
 * */
	public static void main(String[] args) {
	double firstVal=20.00;
	double secondVal=80.00;
	double myValtotal=firstVal+secondVal *100.00d; 
// first second* 100 is getting ran first because of operator precedance if works when  double myValtotal=(firstVal+secondVal) *100.00d;
	double remainder=myValtotal%40.00d;
	System.out.println("the remainder is "+ remainder);
	boolean isNotremainder =(remainder== 0) ? true: false;
	System.out.println(" the value of isnot remainder is "+ isNotremainder);
	if(!isNotremainder) System.out.println(" has got some remainder ");
		

	}

}
