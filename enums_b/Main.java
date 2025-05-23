/*
--- Enum in A Switch Statement
- Enums are often used in switch statements to check for correspoding values: 
 */ 

enum Level {
    LOW,
    MEDIUM,
    HIGH,
} 

public class Main { 
    public static void main(String[] args) { 
        Level myVar = Level.MEDIUM;
    

        switch(myVar)  { 
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
