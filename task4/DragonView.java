package by.epam.basics_of_oop.task4;

import by.epam.basics_of_oop.task4.bean.Dragon;
import by.epam.basics_of_oop.task4.bean.Treasure;

public class DragonView {
	
	private int x;
	private int max;
	private int sumNow;
	private Dragon dragon;
	
	public DragonView(Dragon dragon) {
		super();
		this.dragon = dragon;
	}

	public void showAllTreasures() {
        x = 0;
        for (Treasure treasure : dragon.getTreasures()) {
            x++;
            System.out.print(treasure.getSum() + "\t");
            if (x == 10) {
                System.out.println();
                x = 0;
            }
        }   
    }
    
    public void showMaxTreasure() {
        max = 0;
        for (Treasure treasure : dragon.getTreasures()) {
            if (max < treasure.getSum())
                max = treasure.getSum();
        }
        System.out.println("Most expensive Treasure = " + max);
    }
          
    public void treasuresOnSum(int sum) {
        sumNow = 0;
        for (Treasure treasure : dragon.getTreasures()) {
            sumNow += treasure.getSum();
            if (sumNow <= sum) {
                x++;
                System.out.print(treasure.getSum() + "\t");
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