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
        int choice, numberOfFlowers;
        Scanner input = new Scanner(System.in);
        
        /** Menu */         
        while (true)
        {
            menuText();
            choice = input.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
                case 1:
                    numberOfFlowers = scannerInt();
                    if (numberOfFlowers < 1)
                        numberOfFlowers = 1;
                    Flower flowerRose = new Rose(Flower.Color.Red);
                    Bouquet bouquetRose = new Bouquet(flowerRose, Bouquet.Package.Crumbles);
                    for(int i = 1; i <= numberOfFlowers - 1; i++)
                        bouquetRose.addFlower(flowerRose);    
                    System.out.println(bouquetRose.toString());
                    break;           
                case 2:
                    numberOfFlowers = scannerInt();
                    if (numberOfFlowers < 1)
                        numberOfFlowers = 1;
                    Flower flowerViolet = new Violet(Flower.Color.Violet);
                    Bouquet bouquetViolet = new Bouquet(flowerViolet, Bouquet.Package.Paper);
                    for(int i = 1; i <= numberOfFlowers - 1; i++)
                        bouquetViolet.addFlower(flowerViolet);    
                    System.out.println(bouquetViolet.toString());
                    break;           
                case 3:
                    numberOfFlowers = scannerInt();
                    if (numberOfFlowers < 1)
                        numberOfFlowers = 1;
                    Flower flowerTulip = new Tulip(Flower.Color.White);
                    Bouquet bouquetTulip = new Bouquet(flowerTulip, Bouquet.Package.Net);
                    for(int i = 1; i <= numberOfFlowers - 1; i++)
                        bouquetTulip.addFlower(flowerTulip);    
                    System.out.println(bouquetTulip.toString());
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
            "1. Букет из роз\n" +
            "2. Букет из фиалок\n" +
            "3. Букет из тюльпанов\n" +                     
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
        return input.nextInt();
    }
    
}
