package Basic_01;

public class Java_03_datatypes_strings {

	/* String is a data type but not a primitive type, its a Class
	 * String is a sequence of chars soand it doest have max value it. Technically its limited by memory or the max value of an int 2.14 billion 
	 * 
	 * */
	
	public static void main(String args[])
	{
		String newstring="We are in india ";
		System.out.println(newstring);		
		newstring=newstring+"hello world "+ "\u00A92020";
		System.out.println(newstring);		
		// when two integers are given as string literals and made ot act on any operator it doest perform the operation 
		String num= "10";
		num=num+"20";
		System.out.println("printing value of num "+ num);
		// Even if int data cannot be added as operation to string it only concatenates
		int a =10;
		num=num+a;
		System.out.println("print value of num again"+ num);
		
		/*Strings in java are immutable 
		we can delte chars out of strings - not not really possible 
		coz String in java are immutable means we cants change a string after its created instead a new string is created and 
		reference is pointed to new location.
		So adding and removing values out of sting is inefficient and not recoommended.
		So we do have another class called StringBuffer which is mutable.
		*/
		
		
		
		
	}
	
}
