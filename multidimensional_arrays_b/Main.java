// Use a for loop inside another for loop to get the elements of a two dimensional array 
// We still have to point to the two indexes 

public class Main { 
    public static void main(String[] args) { 
        int[][] score = { {10, 20, 30, 40}, {50, 60, 70, 80, 90, 100} }; 
        for (int i = 0; i < score.length; i++) { 
            for (int j = 0; j < score[i].length; j++) { 
                System.out.println("This is your score: " + score[i][j]);
            }
        }
    }
}











