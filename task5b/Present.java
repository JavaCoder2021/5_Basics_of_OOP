package by.epam.basics_of_oop.task5b;

import java.util.*;

/**
 *
 * @version   1.0 26 11 2021
 * @author    Igor
 */
public class Present {
    
    public static enum Package {
        Paper,
        Film,
        Foil;
    }    
    
    private Package pack; 
    private List<Sweetness> sweets = new ArrayList<Sweetness>();
    
    public Present(Sweetness sweet, Package pack) {
        if (sweet == null) {
            throw new NullPointerException("Argument sweet can not be null.");
        }
        this.sweets.add(sweet);
        if (pack == null) {
            throw new NullPointerException("Argument pack can not be null.");
        }
        this.pack = pack;
    }
        
    public void addSweet(Sweetness sweet) {
        sweets.add(sweet);
    }
    
    @Override
    public String toString() {
        String str = "Present:\n";
        for(Sweetness sweet : sweets)
           str += "Sweetness: " + sweet.getName() + "; Manufacturer: " + 
                   sweet.getManufacturer() + ";\n";
        str += "Package: " + pack;
        return str;
    }    
    
}
