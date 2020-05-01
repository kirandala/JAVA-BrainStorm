package java_06_OOPs_class.classes2;

/**
 * @author kiran dalai
 *
 */
public class java_12_classes_main {
	/*
	 * What is the use of getter and setter methods we shall make some changes on
	 * the car class now in the getter and setter methods we have created
	 */
	public static void main(String[] args) {
		Java_12_classescar porche = new Java_12_classescar();
		Java_12_classescar bmw = new Java_12_classescar();
		porche.setModel("Model 1");
		System.out.println("Model is " + porche.getModel());

		porche.setModel(" hello ");
		System.out.println("Model is " + porche.getModel()); // here we cannot enter into the code block unless we give
																// the model 1 or model 2 so we get output as unknown

	}

}
