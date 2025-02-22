/*
--- Java Wrapper Classes
- Wrapper classes provide a way to use primitive data types(int, boolean, etc) as objects
- Sometimes you must use wrapper classes, e.g when working with Collection objects, such as ArrayList, 
  where primitive types cannot be used(the list can only store objects). 

*/ 

import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) {
         
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        
        myNumbers.add(10); 
        myNumbers.add(15);
        myNumbers.add(20); 
        myNumbers.add(25); 

        for (int i : myNumbers) { 
            System.out.println(i);
        }
    }
} 
