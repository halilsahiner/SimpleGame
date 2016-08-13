package Game;

public class Sword extends Weapon{
	
	public Sword(double price, double weight, double damage){
		super(price,weight,damage);
		
	}
	
	public boolean useItem(){
		System.out.println("The Sword is used and caused damage of "+this.getDamageAmount()+" points.");
		return true;
	}

	@Override
	public String toString() {
		return "Sword [getDamageAmount()=" + this.getDamageAmount() + ", getItemPrice()=" + getItemPrice()
				+ ", getItemWeight()=" + getItemWeight() + "]";
	}
	
	

}
