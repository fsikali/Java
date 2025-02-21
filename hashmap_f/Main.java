/*
--- Loop Through a HashMap 
- Loop through the items of a HashMap witha for-each loop
- N/B: Use the keySet() method if you only want the keys, and use the values() method if you only 
       want the values: 
*/ 

// Print Keys

import java.util.HashMap;

public class Main { 
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        capitalCities.put(" Kenya ", " Nairobi "); 
        capitalCities.put(" Nigeria ", " Lagos "); 
        capitalCities.put(" England ", " London "); 
        capitalCities.put(" South Africa ", " Cape Town "); 

        for (String i: capitalCities.keySet()) 
        { 
            System.out.println(i);
        }
    }
} 
