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
 * Вариант B. Подарки. 
 * Реализовать приложение, позволяющее создавать подарки 
 * (объект, представляющий собой подарок). 
 * Составляющими целого подарка являются сладости и упаковка. 
 */
package by.epam.basics_of_oop.task5b;

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
        int choice, numberOfSweets, choiceSweetness, choicePackage;
        Random random = new Random();

        /** Sweets */
        int TypesSweets = 6;
        Sweetness[] sweetness = new Sweetness[TypesSweets];       
        sweetness[0] = new Chocolate(Sweetness.Manufacturer.Kommunarka);
        sweetness[1] = new Chocolate(Sweetness.Manufacturer.Vityba);        
        sweetness[2] = new Candy(Sweetness.Manufacturer.Slodych);
        sweetness[3] = new Candy(Sweetness.Manufacturer.Spartak);         
        sweetness[4] = new Wafer(Sweetness.Manufacturer.Kommunarka);  
        sweetness[5] = new Wafer(Sweetness.Manufacturer.Spartak);         

        /** Packages */ 
        int TypesPackages = 3;        
        Present.Package pack = Present.Package.Paper;
                
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
                    /** Number of sweets */                    
                    numberOfSweets = scannerInt("Number of sweets: ");   
                    /** Package */
                    choicePackage = random.nextInt(TypesPackages) + 1;
                    switch (choicePackage) {
                        case 1:
                            pack = Present.Package.Film;
                            break;
                        case 2:
                            pack = Present.Package.Foil;
                            break;
                        case 3:
                            pack = Present.Package.Paper;
                            break;                          
                    }
                    /** Present */
                    choiceSweetness = random.nextInt(TypesSweets);                    
                    Present present = new Present(sweetness[choiceSweetness], pack); 
                    /** Add sweets */                    
                    for(int i = 2; i <= numberOfSweets; i++) { 
                        choiceSweetness = random.nextInt(TypesSweets);
                        present.addSweet(sweetness[choiceSweetness]);                                
                    }
                    /** Output */                      
                    System.out.println(present.toString());
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
            "2. Make a present\n" +                    
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
