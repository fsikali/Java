// Break statement can be used to jump out of a loop
// Example in for loop 

public class Main { 
    public static void main(String[] args) { 
       for(int score = 75; score <= 100; score++) { 
            if (score == 85) { 
                break;
            }  

            
            System.out.println("The score is: " + score);          
            // score +=  4;
            
        } 
        //System.out.println(result);
    }
} 

// Check more on break keyword e.g break score * 2 if it is implemented in java