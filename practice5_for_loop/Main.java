// For loop, when you know exactly how many times to loop through a block of code, use a for loop instead of a while loop

public class Main { 
    public static void main(String[] args) { 
        
       // int score = 10; 
        for(int score = 10; score <= 30; score = score + 2) { 
            System.out.println("This is your score: " + score);
        }
    }
}