package java_03_flowControl;

/**
 * @author kiran dalai
 *
 */
public class Java_06_ifstatementcodeblocks {
	/*
	 * if statement identifies which statement or code block to run based on the
	 * value of an expression inside the code block of { and } we can hae one or Multiple statements
	 * 
	 * 
	 */
	public static void main(String[] args) {
		boolean game = true;
		int score = 400;
		int levelcompleted = 5;
		int bonus = 10;

		if (score == 500)
			System.out.println("your score was 400"); // inside the block
		System.out.println("this was executed out"); // not in block

		if (score == 500) {
			System.out.println("your score is 400 seond line "); // inside the codeblock
			System.out.println("we are inside the block"); // inside so will print
		} else if (score > 100) {
			System.out.println(" greater than 100");
		} else {
			System.out.println("none ");
		}
		// any variable initialized inside the code block will be deleted once the code
		// is ran
		// is ran out of the cdoe block lets see this below example

		if (score == 400) {
			int finalval = score + 100;
			
		}
		// System.out.println(finalval); // finalval will print error coz the variable
		// is created and deleted after the if statement so cannot be resolved.
		int finalval = 0;
		if (score == 400) {
			finalval = bonus + score;
		}
		System.out.println("final val after adding the bonus inside the code block is" + finalval);
	}

}
