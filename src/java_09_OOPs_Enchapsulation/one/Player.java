package java_09_OOPs_Enchapsulation.one;

/**
 * @author kiran dalai
 *
 */
public class Player {
	public String name;
	public int health;
	public String weapon;
	
	public void losshealth(int damage) {
		this.health=this.health-damage;
		if(this.health<=0) {
			System.out.println("Player knocket out");
		}
	}
	public int healthleft() {
		return this.health;
		
	}
}
