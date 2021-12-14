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
