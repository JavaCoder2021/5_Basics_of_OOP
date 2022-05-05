package by.epam.basics_of_oop.task4;

import java.util.*;

import by.epam.basics_of_oop.task4.bean.Dragon;
import by.epam.basics_of_oop.task4.bean.Treasure;

public class DragonLogic {
	
	private Random random = new Random();
	private int sum;
	private String name;
	private Dragon dragon;
	
	public DragonLogic(Dragon dragon) {
		super();
		this.dragon = dragon;
	}

	public void addTreasures() {
		for (int i = 0; i < 100; i++) {
			sum = random.nextInt(100) + 1;
			name = String.valueOf(i);
			dragon.addTreasure(new Treasure(name, sum));
        }
	}

}