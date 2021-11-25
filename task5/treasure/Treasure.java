/*
 * @version   1.0 25 11 2021
 * @author    Igor
 */
package by.epam.basics_of_oop.task4.treasure;

/**
 * Treasure class
 *
 * @version   1.0 25 11 2021
 * @author    Igor
 */  
public class Treasure {
    
    /** Treasure cost */
    private int price;

    /**
     * Constructor
     */        
    public Treasure(int price) {
        this.price = price;
    }
        
    /**
     * Get the value of the Treasure
     */         
    public int getPrice() {
        return price;
    }    
    
}
