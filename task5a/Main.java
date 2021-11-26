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
        Scanner input = new Scanner(System.in);
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
        while (true)
        {
            menuText();
            choice = input.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 1) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
                case 1:
                    /** Number of flowers */                    
                    numberOfFlowers = scannerInt();   
                    /** Package */
                    choicePackage = random.nextInt(TypesPackages) + 1;
                    switch (choicePackage)
                    {
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
                    for(int i = 2; i <= numberOfFlowers; i++)
                    { 
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
            "Выберете пункт меню:\n" +
            "0. Выйти\n" +
            "1. Составить цветочную композицию\n" +                    
            "\n"
        );   
    }
    
    /**
     * Scanner value Integer
     */     
    private static int scannerInt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of flowers: ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input!");
            System.out.print("Number of flowers: ");
        }
        int numberOfFlowers = input.nextInt();
        if (numberOfFlowers < 1)
        {
            System.out.println("Invalid input!");            
            numberOfFlowers = 1;
            System.out.println("Number of flowers: " + numberOfFlowers);
        }
        return numberOfFlowers;
    }
    
}
