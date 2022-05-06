/*
 * Задача 5. 
 * Создать консольное приложение, удовлетворяющее следующим требованиям:  
 * •  Корректно спроектируйте и реализуйте предметную область задачи.  
 * •  Для создания объектов из иерархии классов продумайте возможность 
 * использования порождающих шаблонов проектирования. 
 * •  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента. 
 * •  для проверки корректности переданных данных можно применить регулярные выражения. 
 * •  Меню выбора действия пользователем можно не реализовывать, используйте заглушку. 
 * •  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode(). 
 * 
 * Вариант A. Цветочная композиция. 
 * Реализовать приложение, позволяющее создавать цветочные композиции 
 * (объект, представляющий собой цветочную композицию). 
 * Составляющими цветочной композиции являются цветы и упаковка. 
 */
package by.epam.basics_of_oop.task5a;

import java.util.Arrays;

import by.epam.basics_of_oop.task5a.bean.Bouquet;
import by.epam.basics_of_oop.task5a.bean.Flower;

public class Main {

	public static void main(String[] args) {

		Bouquet bouquet = new Bouquet(Package.PAPER,
				Arrays.asList(
					new Flower(Type.ROSE, Color.RED),
					new Flower(Type.ROSE, Color.RED),
					new Flower(Type.ROSE, Color.WHITE),
					new Flower(Type.ROSE, Color.WHITE),
					new Flower(Type.VIOLET, Color.VIOLET)
				));
		
		BouquetView bouquetView = new BouquetView();
		bouquetView.print(bouquet);

	}

}
