package java_01_helloWorld;

/**
 * @author kiran dalai
 *
 */
public class Java_04_Operators_precedence {
	// Logical AND and Logical OR
	/*
	 * And operator comes in two flavors in java as does the OR operator && is the
	 * logcal AND which operated on boolean operands-Checking if condition is true
	 * or false single & is a bitwise operator woirking at bit level . || is logcal
	 * or and similarly works on boolean operands single | is bitwise or working on
	 * bitwise
	 * 
	 * the ! or NOT operator is also known as Logical Complement Operator used for
	 * Booleans to test the alternate values
	 * 
	 */
	public static void main(String[] args) {
		int topScore = 100;
		if (topScore >= 100) {
			System.out.println("You got highest");
		}
		int secondtopScore = 80;
		if ((topScore > secondtopScore) && (topScore < 100)) {
			System.out.println("gresater than second top sore and less than 100");
		}

		if ((topScore > secondtopScore) || (topScore < 100)) {
			System.out.println("Either of the oprands are true so printing this line ");
		}

		// Now

		int newVal = 50;
		// if(newVal=50) this wont work because = Assignment operator and Equal to
		// operator is == so the code works when
		if (newVal == 50) {
			System.out.println("The operation is true ");
		}
		boolean isMule = false;
		if (isMule = true) { // value is assigning true
			System.out.println("code is accepted " + isMule);
		}
		if (isMule) {
			System.out.println("if the value is true then code comes here ");
		}
		// ! or NOT operator is also known as Logical Complement Operator used for
		// Booleans to test the alternate values
		if (!isMule) {
			System.out.println(" code wont run her coz value is true");
		} else
			System.out.println("else statement is printed since ismule is true and we are printing not Notmuleval ");
		// Ternary operator or operator which takes 3 operands
		boolean wascar = isMule ? false : true; // if wascar is true then print the opposite of true as false to wascar
		if (!wascar)
			System.out.println("wascar is true");
		/*
		 * Explanation: int afe of client =20;
		 * 
		 * boolean isEighteenorover=ageOfClient== 20 ? true : false ; operand one -
		 * ageofclient ==20 in this case is the condition we are checking. it needs to
		 * return true or false operand two - true here is the value to assign to the
		 * variable iseighteenoroever if the condition above is true oprand three false
		 * here is the value to assign to the variable isegitheeenorover if the condtion
		 * above was false.
		 */

		/*
		 * SUMMARY OF OPERATORS : docs.oracle.com/javase/tuturials Simple Assignment
		 * Operator = Simple assignment operator Arithmetic Operators + Additive
		 * operator (also used for String concatenation) - Subtraction operator
		 * Multiplication operator / Division operator % Remainder operator Unary
		 * Operators + Unary plus operator; indicates positive value (numbers are
		 * positive without this, however) - Unary minus operator; negates an expression
		 * ++ Increment operator; increments a value by 1 -- Decrement operator;
		 * decrements a value by 1 ! Logical complement operator; inverts the value of a
		 * boolean Equality and Relational Operators == Equal to != Not equal to >
		 * Greater than >= Greater than or equal to < Less than <= Less than or equal to
		 * Conditional Operators && Conditional-AND || Conditional-OR ?: Ternary
		 * (shorthand for if-then-else statement) Type Comparison Operator instanceof
		 * Compares an object to a specified type Bitwise and Bit Shift Operators ~
		 * Unary bitwise complement << Signed left shift >> Signed right shift >>>
		 * Unsigned right shift & Bitwise AND ^ Bitwise exclusive OR | Bitwise inclusive
		 * OR
		 * 
		 * OPERATOR PRECEDENCE: checkout on
		 * :http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		 * 
		 */

	}
}
