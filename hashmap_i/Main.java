/* 
--- Other Types
*/

import java.util.HashMap; 

public class Main { 
    public static void main(String[] args) {
        
        HashMap<String, Integer> students = new HashMap<String, Integer>(); 

        students.put("Simiyu", 32); 
        students.put("Nafula", 30);
        students.put("Wafula", 33); 
        students.put("Otieno", 35);  

        for (String i: students.keySet()) 
        { 
            System.out.println("key: " + i + " value: " + students.get(i));
        }
    }
} 
