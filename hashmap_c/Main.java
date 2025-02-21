/*
--- Remove an Item
- To remove an item, use the remove() method and refer to the key;
*/ 

import java.util.HashMap;

public class Main { 
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        capitalCities.put(" Kenya ", " Nairobi "); 
        capitalCities.put(" Nigeria ", " Lagos "); 
        capitalCities.put(" England ", " London "); 
        capitalCities.put(" South Africa ", " Cape Town ");
        capitalCities.remove(" England ");
        System.out.println(capitalCities);
    }
} 
