package Game;



public abstract class Item {

	private double itemPrice;
	private double itemWeight;
	public static int itemQuantity=0;
	public Item(double price, double weight){
		
		if(price>0 && weight>0){
			this.itemPrice = price;
			this.itemWeight = weight;
		
		}
		else{
			itemPrice=0;
			itemWeight=0;
			System.out.println("price ve weight 0'dan kucuk olamaz.");}
		 itemQuantity+=1;
	}
	

	
	public static int getItemQuantity(){
		
		return itemQuantity;
		
	}

	public double getItemPrice() {
		return itemPrice;
	}

//	public void setItemPrice(double itemPrice) {
//		this.itemPrice = itemPrice;
//	}

	public double getItemWeight() {
		return itemWeight;
	}

//	public void setItemWeight(double itemWeight) {
//		this.itemWeight = itemWeight;
//	}
	
	public abstract boolean useItem();
	
}
