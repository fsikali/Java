/* 
--- Other Types
- Items in HashSet are actually objects
*/

import java.util.HashSet;

public class Main { 
    public static void main(String[] args) {
        
        HashSet<Integer> numbers = new HashSet<Integer>(); 

        numbers.add(1);
        numbers.add(2); 
        numbers.add(3); 
        numbers.add(4);
        numbers.add(5); 
       
        for (int i = 1; i <= 10; i++ ) 
        {
            if(numbers.contains(i)) { 
                System.out.println(i + " was found in the set.");
            } else { 
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
