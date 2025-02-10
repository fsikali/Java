/*
 --- Java Enums
- An enum is a special "class" that represents a group of constants(unchangeable variables, 
   like final variables). 
- To create an enum. use the enum keyword(instead of class or interface), and separate the
  constants with a comma.
- Note that they should be in uppercase letters
- You can access enum constants with a dot syntax:
- Enum is short for "enumerations", which means "specifically listed" 

--- Enum inside a Class
- You can also have an enum inside a class:
 */   

 public class Main { 
    enum Level { 
        LOW,
        MEDIUM,
        HIGH,
    }

public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}

