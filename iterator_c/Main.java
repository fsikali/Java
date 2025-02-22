/*
--- Remobing items from a Collection
- Iterators are designed to easily change the collections that they loop through the remove() method 
  can remove items from a collection while looping  

- N/B - Trying to remove an items using a for loop or a for-each loop would not work correctly because
        the collection is changing size at the same time that the code is trying to loop
*/

// Example: Use an iterator to remove numbers less than 10 from a collection 

import java.util.ArrayList;
import java.util.Iterator;

public class Main { 
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 

        numbers.add(12); 
        numbers.add(8);
        numbers.add(2); 
        numbers.add(23); 

        Iterator<Integer> it = numbers.iterator(); 

        while(it.hasNext())
        { 
            Integer i = it.next(); 
            if(i < 10) 
            { 
                it.remove();
            }
        } 
        System.out.println(numbers);
    }
} 

