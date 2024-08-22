// Enums - is a special cclass that represents a group of constants(unchangeable variables, like final variables) 
// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma,
// N/B - They should be in uppercase letters 

// Example - Enum inside a Class

enum Level { 
    LOW,
    MEDIUM,
    HIGH
}  

public class Main { 
    public static void main(String[] args) { 
        Level myVar = Level.MEDIUM; 
        System.out.println(myVar);
    }
}
























