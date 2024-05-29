 // Break keyword in while loop 

public class Main { 
    public static void main(String[] args) { 
        int score = 45; 
        while(score <= 100) { 
            System.out.println("Your score is: "+ score); 
            score++; 

            if (score == 65){ 
                break;
            }
        }
    }
}