/*
--- Loop Through a HashMap 
*/ 

// Print values

import java.util.HashMap; 

public class Main { 
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        capitalCities.put(" Kenya ", " Nairobi "); 
        capitalCities.put(" Nigeria ", " Lagos "); 
        capitalCities.put(" England ", " London "); 
        capitalCities.put(" South Africa ", " Cape Town ");

        for(String i: capitalCities.values()) 
        { 
            System.out.println(i);
        }
    } 
} 
