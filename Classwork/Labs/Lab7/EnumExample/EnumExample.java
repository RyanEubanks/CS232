package Classwork.Labs.Lab7.EnumExample;

// An enum is a special "class" that represents a group of constants
public class EnumExample {

    public static void main(String[] args) {
        Level myVar = Level.Medium;
        System.out.println(myVar);
        
        // Possible to use myVar with switch case.
        // loop through enum
        for(Level var : Level.values()) {
            System.out.println(var.ordinal()); // ordinal print the value
        }
        
    }
    
}
