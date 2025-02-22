/*
--- Java HashSet
- A HashSet is a collection of items where every item is unique, and it is found in the java.util package;
- The HashSet class has many useful methods e.g to add items to it, use the add() method
- In this example, even though BMW is added twice it only appears once in the set because every item in
  a set has to be unique.
*/

import java.util.HashSet;

public class Main { 
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>();
        
        cars.add("Volvo");
        cars.add("BMW"); 
        cars.add("Ford"); 
        cars.add("BMW");
        cars.add("Mazda"); 
        System.out.println(cars);
    }
}
