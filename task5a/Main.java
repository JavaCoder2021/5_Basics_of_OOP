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

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Igor
 */
public class Main {
       
    /**
     * main class
     *
     * @version   1.0 26 11 2021
     * @author    Igor
     */
    public static void main(String[] args) {
        
        /** Variables for calculations */
        int choice, numberOfFlowers, choiceFlower, choicePackage;
        Random random = new Random();

        /** Flowers */
        int TypesFlowers = 5;
        Flower[] flower = new Flower[TypesFlowers];       
        flower[0] = new Rose(Flower.Color.Red);
        flower[1] = new Rose(Flower.Color.White);        
        flower[2] = new Violet(Flower.Color.Violet);
        flower[3] = new Tulip(Flower.Color.Red);         
        flower[4] = new Tulip(Flower.Color.White);     

        /** Packages */ 
        int TypesPackages = 5;        
        Bouquet.Package pack = Bouquet.Package.Crumbles;
                
        /** Menu */         
        while (true) {
            menuText();
            choice = scannerInt("");
            if (choice == 1)
                break;
            if (choice < 1 || choice > 2) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 2:
                    /** Number of flowers */                    
                    numberOfFlowers = scannerInt("Number of flowers: ");   
                    /** Package */
                    choicePackage = random.nextInt(TypesPackages) + 1;
                    switch (choicePackage) {
                        case 1:
                            pack = Bouquet.Package.Crumbles;
                            break;
                        case 2:
                            pack = Bouquet.Package.Film;
                            break;
                        case 3:
                            pack = Bouquet.Package.Net;
                            break;
                        case 4:
                            pack = Bouquet.Package.Organza;
                            break;
                        case 5:
                            pack = Bouquet.Package.Paper;
                            break;                            
                    }
                    /** Bouquet */
                    choiceFlower = random.nextInt(TypesFlowers);                    
                    Bouquet bouquet = new Bouquet(flower[choiceFlower], pack); 
                    /** Add flowers */                    
                    for(int i = 2; i <= numberOfFlowers; i++) { 
                        choiceFlower = random.nextInt(TypesFlowers);
                        bouquet.addFlower(flower[choiceFlower]);                                
                    }
                    /** Output */                      
                    System.out.println(bouquet.toString());
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
            "1. Exit\n" +
            "2. Make a flower arrangement\n" +                    
            "\n"
        );   
    }
    
    /**
     * Scanner value Integer
     */
    private static int scannerInt(String str) {     
        Scanner input = new Scanner(System.in);
        int num = -1;
        do {
            System.out.print(str);
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);
        return num;  
    }
    
}
