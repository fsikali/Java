/*
--- ArrayList Size
- To find out how many elements an ArrayList have, use the size method
 */ 

import java.util.ArrayList; 

public class Main { 
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); 
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.size());
    }
} 
