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

import by.epam.basics_of_oop.task4.dragon.*;
import java.util.Scanner;

/**
 * Main class
 *
 * @version   1.0 25 11 2021
 * @author    Igor
 */
public class Main {
    
    /**
     * main class
     *
     * @version   1.0 25 11 2021
     * @author    Igor
     */
    public static void main(String[] args) {
        
        /** Variables for calculations */
        int choice;

        /** Dragon class object */        
        Dragon dragon = new Dragon();
        
        /** Menu */         
        while (true) {
            menuText();
            choice = scannerInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 1:
                    dragon.showTreasures();
                    break;           
                case 2:
                    dragon.showMaxTreasure();
                    break;           
                case 3:
                    dragon.treasuresOnSum(scannerInt());
                    break;
            }     
            
        }        
        
    }

    /**
     * Text of menu
     */    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. View treasures\n" +
            "2. Most precious treasure\n" +
            "3. Treasures for a given amount\n" +                 
            "\n"
        );   
    }
    
    /**
     * Scanner value Integer
     */     
    private static int scannerInt(){   
        Scanner input = new Scanner(System.in);
        int num = -1;       
        do {
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num < 0);
        return num;
    }

}
