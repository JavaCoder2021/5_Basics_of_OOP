package by.epam.basics_of_oop.task5b;

/**
 *
 * @version   1.0 26 11 2021
 * @author    Igor
 */
public class Sweetness {
    
    public static enum Manufacturer {
        Kommunarka, 
        Spartak,
        Slodych, 
        Vityba;
    }
    
    private String name;
    private Manufacturer manufacturer;
    
    public Sweetness(String name, Manufacturer manufacturer) {
        if (name == null) {
            throw new NullPointerException("Argument name can not be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of sweetness can not be empty.");
        }
        this.name = name;
        if (manufacturer == null) {
            throw new NullPointerException("Argument manufacturer can not be null.");
        }
        this.manufacturer = manufacturer;
    }
    
    public String getName() {
        return name;
    }
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    
}
