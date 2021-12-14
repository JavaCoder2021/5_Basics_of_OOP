package by.epam.basics_of_oop.task4.dragon;

import by.epam.basics_of_oop.task4.treasure.*;
import java.util.*;

/**
 * Dragon class
 *
 * @version   1.0 25 11 2021
 * @author    Igor
 */
public class Dragon {
    
    /** Variables for calculations */     
    int x, max, sumNow;
    Random random = new Random();
    
    /** Number of Treasures */    
    final int treasureCount = 100;
    
    /** An array that stores objects of the Treasure class */
    Treasure[] treasure = new Treasure[treasureCount];

    /**
     * Constructor
     * Additive values of Treasure
     */        
    public Dragon() {
        for (int i = 0; i < treasure.length; i++) {
            treasure[i] = new Treasure(random.nextInt(100) + 1);
        }   
    }
    
    /**
     * Show values of Treasure
     */        
    public void showTreasures() {
        x = 0;
        for (int i = 0; i < treasure.length; i++) {
            x++;
            System.out.print(treasure[i].getPrice() + "\t");
            if (x == 10) {
                System.out.println();
                x = 0;
            }
        }   
    }  
    
    /**
     * Show max value of Treasure
     */        
    public void showMaxTreasure() {
        max = 0;
        for (int i = 0; i < treasure.length; i++) {
            if (max < treasure[i].getPrice())
                max = treasure[i].getPrice();
        }
        System.out.println("Most expensive Treasure = " + max);
    }  
    
    /**
     * List of Treasures for a given amount
     */        
    public void treasuresOnSum(int sum) {
        sumNow = 0;
        for (int i = 0; i < treasure.length; i++) {
            sumNow += treasure[i].getPrice();
            if (sumNow <= sum) {
                x++;
                System.out.print(treasure[i].getPrice() + "\t");
                if (x == 10) {
                    System.out.println();
                    x = 0;
                }
            }
            else
                break;
        }
        System.out.println();
    }
    
}
