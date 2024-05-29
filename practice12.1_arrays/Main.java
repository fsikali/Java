// Java arrays 

public class Main { 
    public static void main(String[] args) { 
        int[] score = {45, 75, 80, 82, 94 ,100}; 
        System.out.println("This is your score: " + score[5]);  

        int x = score[3]; 
        System.out.println("This is your score: " + score[3]);

        score[1] = 95; 
        System.out.println("This is your new score from 75 to: " + score[1]); 

        for (int i = 0; i < score.length; i++) { 
             System.out.println(score[i]);  

             if (score[i] == 94) { 
                break;
             }
        } 
    }
}