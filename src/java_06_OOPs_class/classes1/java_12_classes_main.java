package java_06_OOPs_class.classes1;

/**
 * @author kiran dalai
 *
 */
public class java_12_classes_main {
/* 
 * */
	public static void main(String[] args) {
		Java_12_classescar porche = new Java_12_classescar(); // we have created a object on that class
																// Java_12_classescar
		Java_12_classescar bmw = new Java_12_classescar(); // we have created another object for the class
															// Java_12_classescar
		// posche. we cannot access the variables which are declared as private .
		System.out.println("Model is " + porche.getModel());
		// output for above statement will be null coz nothing is initlized now and
		// String class will take null if nothing is available
		porche.setModel("Model 1");
		System.out.println("Model is " + porche.getModel());
	}

}
