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
 * @version   1.0 25 11 2021
 * @author    Igor
 */
public class Flower {
    
    public static enum Color {
        Red, 
        White,
        Yellow, 
        Scarlet,
        Violet,
        Green;
    }
    
    private String name;
    private Color color;
    
    public Flower(String name, Color color) {
        if (name == null) {
            throw new NullPointerException("Argument name can not be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of flower can not be empty.");
        }
        this.name = name;
        if (color == null) {
            throw new NullPointerException("Argument color can not be null.");
        }
        this.color = color;
    }
    
    public String getName() {
        return name;
    }
    
    public Color getColor() {
        return color;
    }
    
}
