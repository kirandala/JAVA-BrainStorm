package java_10_List.Arraylist.A01;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Grocerry {

	/**
	 * Resizable array heterogeneous as it holds objects,including null,is similar to
	 * vector but array list is syncronized
	 */

	private ArrayList<String> grocerrylist = new ArrayList<String>();

	public void addgro(String item) {
		grocerrylist.add(item);
	}

	public void printgro() {
		System.out.println("You have " + grocerrylist.size() + " items in your grocery list");
		for (int i = 0; i < grocerrylist.size(); i++) {
			System.out.println(i + 1 + " ." + grocerrylist.get(i));
		}
	}

	public void modifygorcerryitem(int position, String newitem) {
		grocerrylist.set(position, newitem);
		System.out.println("Grocerry item " + position + 1 + " has be been modified");
	}
	public void removegrocerryitem(int position) {
		String theitem=grocerrylist.get(position);
		grocerrylist.remove(position);
		
	}
	public String finditem(String searchitem) {
		// boolean exists=grocerrylist.contains(searchitem);
		int position =grocerrylist.indexOf(searchitem);
		if(position >0) {
			return grocerrylist.get(position);
		}
		else return null;
	}


}
