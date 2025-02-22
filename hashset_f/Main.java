/* 
--- Loop Through a HashSet
- Loop through the items of HashSet with a for-each loop:
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

        for (String i : cars) 
        { 
            System.out.println(i);
        }
    }
}
