/*
--- Java HashMap
- In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you 
  have to access them with an index number (int type).
- A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type(e.g String)
- One object is used as a key (index) to another object(value).
- It can store different types: String keys and Integer values, or the same type, like: String keys and String values: 
*/

// Example: Create a HashMap object called capitalCities that will store String keys and String values
// Add Items: The HashMap class has many useful methods. e.g, to add items to it, use the put() method

import java.util.HashMap;

public class Main { 
    public static void main(String[] args) { 
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        // Add keys and values (Country, City)
        capitalCities.put(" Kenya ", " Nairobi"); 
        capitalCities.put(" Uganda ", " Kampala"); 
        capitalCities.put(" Tanzania ", " Dar Salaam"); 
        capitalCities.put(" Rwanda ", " Kigali "); 
        System.out.println(capitalCities);
    }
}
