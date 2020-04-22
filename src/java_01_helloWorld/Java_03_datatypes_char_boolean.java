package java_01_helloWorld;

/**
 * @author kirandalai
 *
 */
public class Java_03_datatypes_char_boolean {
	/*
	 * char stores characters in this case only single character example: last key
	 * used by a programmer or menu option to select char occupies two bytes of
	 * memory or 16 bits coz it also stores unicode characters Unicode in a
	 * internatinal encoding standard for use with different languages and scripts,
	 * buy which each letter,digit or symol is assigned a unique numeric value that
	 * applies across different platforms and programms a-z -26 chars and there are
	 * total of 65535 characters
	 * 
	 */

	/*
	 * Bloolean value allows only two choices true or False, Yes or No, or 1 or 0.
	 * We have a boolean primitive type and it can be set to two values only.
	 */

	public static void main(String[] args) {
		char thischar = 'd';
		char myunicodechar = '\u0F6A';
		System.out.println(" my char is " + thischar);
		System.out.println(" my unicode char is " + myunicodechar);

		boolean booleanval1 = true;
		boolean booleanval2 = false;

		boolean iscustomeover18 = true; // always use the variable name which starts with "is" makes easy to understand.

		System.out.println(booleanval1);
		System.out.println(booleanval2);
		System.out.println(iscustomeover18);
	}

}
