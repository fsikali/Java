// Break statement can be used to jump out of a loop
// Example in for loop 

public class Main { 
    public static void main(String[] args) { 
        for(int score = 75; score <= 100; score++) { 
            if (score == 85) { 
                break;
            } 
            System.out.println(score);
        }
    }
}