/*
--- Java ArrayList
- The ArrayList class is a resizable array, which can be found in the java.util package.
- The difference between a built-in array and an ArrayList in Java, is that the size of an array
  cannot be modified(if you want to add or remove elements to/from an array, you have to create
  a new one.)
- Elements can be added and removed from an ArrayList whenever you want.
- The syntax is also slightly different: 
- The ArrayList class has many useful methods.
- Example to add elements to the ArrayList, use the add() method:
*/

import java.util.ArrayList; 

public class Main { 
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo"); 
        cars.add("BMW"); 
        cars.add("Ford"); 
        cars.add("Mazda"); 
        cars.add("Toyota");
        System.out.println(cars);
    }
}
