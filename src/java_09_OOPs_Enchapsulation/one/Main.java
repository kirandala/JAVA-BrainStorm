package java_09_OOPs_Enchapsulation.one;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * Encapsulation is the mechanism in which you restrict the access to certain
	 * components in an object so we are able to protect the members of the class
	 * 
	 * Also if small changes like the name or health or weapon is changed in the
	 * player class we need to make modification even here this becomes a very big
	 * problem in big applications
	 * 
	 * if we miss any line of code below the player health can't be accurate the
	 * example is given below program in the package
	 * 
	 * the right way of doing it is given in next package 
	 * 
	 */
	public static void main(String[] args) {
		Player plr = new Player();
		plr.name = "kiran";
		plr.health = 20;
		plr.weapon = "sword";

		int damage = 20;
		plr.losshealth(damage);
		System.out.println("remainig health" + plr.healthleft());
		damage = 11;
		plr.health = 200; // when health is increased the whole health will be impacted and changed
		plr.losshealth(damage);
		System.out.println("remainig health" + plr.healthleft());

	}
}
