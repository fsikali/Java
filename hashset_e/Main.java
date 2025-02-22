/*
--- HashSet Size
- To find out how many items there are, use the size method: 
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
        System.out.println(cars.size());
    }
}
