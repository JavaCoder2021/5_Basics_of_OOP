package by.epam.basics_of_oop.task5a;

import java.util.*;

/**
 *
 * @author Igor
 */
public class Bouquet {
    
    public static enum Package {
        Paper,
        Film,
        Net,
        Organza,
        Crumbles;
    }    
    
    private Package pack; 
    private List<Flower> flowers = new ArrayList<Flower>();
    
    public Bouquet(Flower flower, Package pack) {
        if (flower == null) {
            throw new NullPointerException("Argument flower can not be null.");
        }
        this.flowers.add(flower);
        if (pack == null) {
            throw new NullPointerException("Argument pack can not be null.");
        }
        this.pack = pack;
    }
        
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    
    @Override
    public String toString() {
        String str = "Bouquet:\n";
        for(Flower flower : flowers)
           str += "Flower: " + flower.getName() + ";\t Color: " + 
                   flower.getColor() + ";\n";
        str += "Package: " + pack;
        return str;
    }
    
}
