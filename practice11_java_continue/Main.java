// Continue keyword in while loop

public class Main { 
    public static void main(String[] args) { 
        int score = 15; 
        while (score <= 25){  
            System.out.println("This is your score: "+ score); 
            score++;  

            if (score == 20) {  
                score++;
                continue;
            } 
            
        }
    }
}