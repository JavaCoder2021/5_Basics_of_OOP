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

/**
 *
 * @author Igor
 */
public class Main {
       
    /**
     * main class
     *
     * @version   1.0 25 11 2021
     * @author    Igor
     */
    public static void main(String[] args) {
        
        Flower flower1 = new Rouse(Flower.Color.Red);
        Flower flower2 = new Violet(Flower.Color.Violet);
        Flower flower3 = new Tulip(Flower.Color.White);
        
        Bouquet bouquet = new Bouquet(new Rouse(Flower.Color.Red), Bouquet.Package.Crumbles);
        bouquet.addFlower(flower1);
        bouquet.addFlower(flower2);
        bouquet.addFlower(flower3);
        
        System.out.println(bouquet.toString());
        
    }
    
}
