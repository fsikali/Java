// HashMap Size
// To find out how many items there are, use the size() method:

import java.util.HashMap;

public class Main { 
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 

        capitalCities.put(" Kenya ", " Nairobi "); 
        capitalCities.put(" Nigeria ", " Lagos "); 
        capitalCities.put(" England ", " London "); 
        capitalCities.put(" South Africa ", " Cape Town ");
        System.out.println(capitalCities.size());
    }
} 
