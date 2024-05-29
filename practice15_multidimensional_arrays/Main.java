// A multidimensional array is an array of arrays 
// To create a two-dimensional array create each array within its own set of cury braces  

public class Main { 
    public static void main(String[] args) { 
        int[][] score = { {10, 20, 30, 40}, {50, 60, 70, 80, 90, 100} }; 
        System.out.println("This is your score: " + score[1][3]); 

        int x = score[1][5]; 
        System.out.println("This is your score:" + x);
    }
}



























