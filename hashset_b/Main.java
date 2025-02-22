/*
--- Check If an Item Exists
- To check whether an item exists in a HashSet, use the contains() method:
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
        cars.contains("Mazda"); 
        System.out.println(cars.contains("Mazda"));
    }
} 
