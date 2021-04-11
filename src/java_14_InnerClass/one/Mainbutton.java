
package java_14_InnerClass.one;

import java.util.Scanner;

import java_14_InnerClass.one.Button.onclicklistener;

/**
 * @author kiran dalai
 *
 */
public class Mainbutton {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btn = new Button("print");

	public static void main(String[] args) {
		
		class clickListner implements Button.onclicklistener {
			public clickListner() {
				System.out.println("I've been attached");
			}
			@Override
			public void onclick(String title) {
				System.out.println(title + " was clicked");
			}
		}
		
		// btn.setonclicklistner(new clickListner()); similar code also can be written using anaonamus class 
		btn.setonclicklister(new onclicklistener() {
			@Override
			public void onclick(String title) {
						System.out.println(title+" was clicked");		
			}
		});
		listen();
		
	}
	private static void listen() {
		boolean quit=false;
		
		while(!quit){
			int choice =scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				quit=true;
				break;
			case 1:
				btn.onclick();
			}
		}
	}

}
