package Game;



public class GameTest {

    public static void main(String[] args) {
        
        System.out.println("Total number of items before creating items: " + Item.getItemQuantity());
        
        // Initialize armor, sword and bow objects
        Armor armor = new Armor(100, 50, 200);
        Sword sword = new Sword(50, 20, 40);
        Bow bow = new Bow(20, 5, 2, 5);
                
        System.out.println("Total number of items after creating items: " + Item.getItemQuantity());
        
        System.out.println();
        System.out.println(armor);
        System.out.println(sword);
        System.out.println(bow);
    
        // Use the armor, get hit and print its information
        armor.useItem();
        armor.getHit(50);
        System.out.println(armor);
        
        // Upgrade the armor and print its information
        armor.upgrade();
        System.out.println("Armor is upgraded");
        System.out.println(armor);
        
        // Use the sword and print its information
        sword.useItem();
        System.out.println(sword);
        
        // Use the bow until all arrows are thrown
        while(bow.getNumArrows() > 0)
            bow.useItem();
            
        // Print the arrow's information before and after an upgrade
        System.out.println(bow);
        bow.upgrade();
        System.out.println("Bow is upgraded");
        System.out.println(bow);
              
    }
}