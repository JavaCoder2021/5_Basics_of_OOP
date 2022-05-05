/*
 * Задача 4. 
 * Создать консольное приложение, удовлетворяющее следующим требованиям:  
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.  
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.  
 * • Наследование должно применяться только тогда, когда это имеет смысл.  
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.  
 * • Классы должны быть грамотно разложены по пакетам.  
 * • Консольное меню должно быть минимальным.  
 * • Для хранения данных можно использовать файлы.
 *
 * Дракон и его сокровища. 
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.  
 * Реализовать  возможность  
 * просмотра  сокровищ,  
 * выбора  самого  дорогого  по  стоимости  сокровища  и 
 * выбора сокровищ на заданную сумму.
 */
package by.epam.basics_of_oop.task4;

import java.util.Scanner;
import by.epam.basics_of_oop.task4.bean.Dragon;

public class Main {

	public static void main(String[] args) {

	      	int choice;
      
	        Dragon dragon = new Dragon();
	        DragonLogic dragonLogic = new DragonLogic(dragon);
	        DragonView dragonView = new DragonView(dragon);
	        
	        dragonLogic.addTreasures();
	        
	        while (true) {
	            menuText();
	            choice = getIntFromConsol("");

	            if (choice < 0 || choice > 3) {
	                System.out.println("Incorrect choose!");
	                continue;
	            }
	             
	            if (choice == 0)
	                break;
	            switch (choice) {
	                case 1:
	                	dragonView.showAllTreasures();
	                    	break;           
	                case 2:
	                	dragonView.showMaxTreasure();
	                    	break;           
	                case 3:
	                	dragonView.treasuresOnSum(getIntFromConsol("Sum: "));
	                    	break;
	            }     
	            
	        }        

	}
	
	public static void menuText() { 
             System.out.print(
	            "\n" + 
	            "Select the menu item:\n" +
	            "0. Exit\n" +
	            "1. View treasures\n" +
	            "2. Most expensive treasure\n" +
	            "3. Treasures for a given amount\n" +                 
	            "\n"
	    );   
	}
	
	public static int getIntFromConsol(String str) {

		int a;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.print(str);
		}
		a = scanner.nextInt();

		return a;

	}

}
