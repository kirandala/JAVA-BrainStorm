package java_16_Cloneable;

public class ClassTest implements Cloneable {

	int a=10;
	public void mister() {
		System.out.println("inside mister method");
	}
	
	public static void main(String [] args) {
		
	
	ClassTest clst=new ClassTest();
	clst.a=20;
	System.out.println("the values after updating 20 is "+ clst.a);
	
	try {
		ClassTest clst1= (ClassTest)clst.clone(); // creating a new object other than new keyword
		clst1.a=30;
		System.out.println("values after updating to new value is "+clst1.a);// new object value #30 
		System.out.println("Values after updating to new value is "+clst.a);// old object value  #20
	}
	catch(Exception e){	
	}
}
}
	
