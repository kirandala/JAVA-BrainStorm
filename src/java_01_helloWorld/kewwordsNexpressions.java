package java_01_helloWorld;

/**
 * @author kiran dalai
 *
 */
public class kewwordsNexpressions {

	/*
	 * java keywords have 53 reserve words ide will make it Marron color if its a
	 * keyword. expressions are variables, operators and values together double
	 * kilometers=100*1.6089; kilometers=100*1.6089 will be and expression and
	 * adding the dataype will make a vaild java statement. Java will remove the
	 * whitespace if any in the code. Indenting will help to read the code
	 * effectively and also easy to undertand the mistakes in the code.
	 */
	public static void main(String[] args) {
		int int1 = 5; // int is an reserve word so cannot use int as variable so we use other than the
						// keywords. this entire line is an statement.
		if (int1 == 5) {
			System.out.println("This is an expression"); // this is another expression ideally anything under the
															// brackets is expressions the entire line is statement
			int var = 50;
			var--;
			System.out.println(var);// its possible and valid but not recommended to put statements in same line

		}

	}

}
