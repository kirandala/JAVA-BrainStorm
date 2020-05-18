package java_14_InnerClass.one;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * Java we can also have nested classes
	 * 
	 * non static classes or nested class
	 * 
	 */
	public static void main(String[] args) {
//		GearBox mclaren = new GearBox(6);
//		GearBox.Gear first = mclaren.new Gear(1, 12.5); // we need to specify the outclass.innerclass and
//														// outerclassintance.new to create a new object for inner class
//		// also the inner class will be private so we cannot directly interact with
//		// innerclass without the instance of outer class 
//		
//		// If the inner class is private we cannot use the above mentioned 
//
//		GearBox.Gear second = mclaren.new Gear(2, 15.9);
//		GearBox.Gear third = mclaren.new Gear(3, 40.8);
//		System.out.println(first.drivespeed(1000));
		
		// the above code works when the inner class in public 
		
		GearBox mclaren=new GearBox(6);
		mclaren.addGear(1, 5.3);
		mclaren.addGear(2, 10.3);
		mclaren.addGear(3, 15.3);
		mclaren.operateclutch(true);
		mclaren.changeGear(1);
		mclaren.operateclutch(false);
		System.out.println(mclaren.wheelspeed(1000));
		mclaren.changeGear(2);
		System.out.println(mclaren.wheelspeed(3000));
		mclaren.operateclutch(true);
		mclaren.changeGear(3);
		mclaren.operateclutch(false);
		System.out.println(mclaren.wheelspeed(5000));
		mclaren.operateclutch(true);
		mclaren.changeGear(4);
		mclaren.operateclutch(false);
		System.out.println(mclaren.wheelspeed(6000));
		
	

	}
}
