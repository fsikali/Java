// To remove all items, use the clear() method:

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>(); 

        cars.add("Volvo");
        cars.add("BMW"); 
        cars.add("Ford"); 
        cars.add("BMW");
        cars.add("Mazda"); 
        cars.clear(); 
        System.out.println(cars);
    }
}
