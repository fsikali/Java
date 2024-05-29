/* Continue keyword breaks one iteration in the loop if a specified condition is occurs and continues 
   with the next iteration in the loop 
*/ 
// Example in for loop   
//?

public class Main { 
    public static void main(String[] args) { 
        for(int score = 10; score <= 20; score++){ 
             if (score == 15){ 
                continue;
             } 
             System.out.println("This is your score: "+ score);
        }
    }
}