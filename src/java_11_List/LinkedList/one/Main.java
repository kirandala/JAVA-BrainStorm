package java_11_List.LinkedList.one;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * linked list
	 * 
	 */
	public static void main(String[] args) {
		Customer customer = new Customer("Kiran", 100);
		Customer anothercustomer;
		anothercustomer = customer;
		anothercustomer.setBalance(120.12);

		// printing the customer object values now will print the new value
		System.out.println("Balance for customer is " + customer.getBalance());
		// when we are assigning the customer instance to another customer java is
		// pointing to the same object and hence when the value is changed automatically
		// object space is modified

		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(3);
		intlist.add(4);

		for (int i = 0; i < intlist.size(); i++) {
			System.out.println(i + " : " + intlist.get(i));

		}

		intlist.add(1, 6);
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println(i + " : " + intlist.get(i));

		}
		// to perform the above operation when one digit has to placed in the middle the
		// other values and the indexs has to be moved to next place and this operation
		// will consume a lot of space on ram.
		
		// So insertion in the middle will be handled by linked list coz it points to the next element .
		
	}

}
