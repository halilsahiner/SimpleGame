package Game;

public abstract class Weapon extends Item {
	private double damageAmount;
	
	public Weapon(double price, double weight,double damage){
		super(price,weight);
		if(damage>0){
			this.damageAmount=damage;
		}
		else
			damage=0;
		}
	

	public double getDamageAmount() {
		return damageAmount;
	}

	@Override
	public String toString() {
		return "\nWeapon Damage Amount" + this.damageAmount +"\nWeapon Price"
				+ getItemPrice() + "\nWeapon Weight" + getItemWeight()  ;
	}

	@Override
	public boolean useItem() {
		// TODO Auto-generated method stub
		return false;
}

	

}
