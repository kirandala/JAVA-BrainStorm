package java_10_Recap_96;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * The purpose of application is to help a company called bills burgers to
	 * manage their process of selling hamburgers. Our application will help bill to
	 * select types of burgers, some of the additional items to be added to the
	 * burgers and pricing. We want to create abase hamburger , but also tow other
	 * types of hamburgers that are popular ones in Bills store. The basic hamburger
	 * shoul have the following items. Bread roll type, Meat and up to 4 additional
	 * additions (things like lettuce,tomato,carrrot etc) that the customer can
	 * select to be added to the burger. Each one of these items gets charged an
	 * additional price so you need some way to track how many items got added and
	 * to calculate the final price (base burger with all the additions) THis burger
	 * has a base price and the additions are all separately priced (up to 4
	 * additions as mentioned above)
	 *
	 * Create a Hamburger Class to deal with all the above The constructor should
	 * only include the roll type,meat and price can also include name of burger or
	 * you can use a setter.
	 *
	 * Also create tow extra varieties of hamburger(subclasses ) to cater for. a)
	 * Healthy burger(on a brown rye bread roll), plus tow additional items that can
	 * be added. The healthy buger can have 6 items (additions) in total. hint: You
	 * probably want to process the two additionals are only appropriate for this
	 * new class( in other words new burger type) b) Delux hamburger-goes with chops
	 * and drinks as additions but no extra additions are allowed. hint: you have to
	 * find a way to automatically add these new additons at the time the delux
	 * burger object is create, then prevent other additons being made.
	 *
	 * 
	 * All 3 classes should have a method that can be called any time to show the
	 * base price of hamburger plus all additionals, each showing the addition name,
	 * and additon price and a grand final total for the burger(base+ all addtions)
	 * FOr the two additional classes this may require you to be looking at the base
	 * class for pricing and then adding totals to final price.
	 */
	public static void main(String [] args) {
		Hamburger hm=new Hamburger("Basic","chicken",150,"white");
		double price=hm.itemedhamburger();
		hm.addhamburgeraddon1("tomato", 20);
		hm.addhamburgeraddon2("Lettuce", 30);
		hm.addhamburgeraddon3("cheeze", 10);
		System.out.println("total price of hamburger is "+hm.itemedhamburger());
		
		HealthyBurger healthhm=new HealthyBurger("Mutton",200);
		healthhm.itemedhamburger();
		healthhm.addhamburgeraddon1("peper", 20);
		healthhm.addhamburgeraddon2("sause", 20);
		System.out.println("total price of hamburger is "+healthhm.itemedhamburger());
		
		DeluxBurger db=new DeluxBurger();
		db.itemedhamburger();
		db.addhamburgeraddon3("should not do this", 100);
		db.itemedhamburger();
	}
}
