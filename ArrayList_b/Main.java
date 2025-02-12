/*
--- Access an Item 
- To access an element in the ArrayList, use the get() method and refer to the index number
- Array indexes start with 0:[0] is the first element. [1] is the second element etc.
*/ 

import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo"); 
        cars.add("BMW"); 
        cars.add("Ford"); 
        cars.add("Mazda");
        System.out.println(cars.get(0));
    }
}
