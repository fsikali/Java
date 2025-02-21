// To remove all items, use the clear() method

import java.util.HashMap;

public class Main { 
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        capitalCities.put(" Kenya ", " Nairobi "); 
        capitalCities.put(" Nigeria ", " Lagos "); 
        capitalCities.put(" England ", " London "); 
        capitalCities.put(" South Africa ", " Cape Town "); 
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
