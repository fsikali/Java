public class Main {
    public void gamePlayed() {
        System.out.println("I played basketball"); 
    } 

    public void score(int maxScore) { 
        System.out.println("Max score in the game is: " + maxScore); 

    } 

    public static void main(String[] args) { 
        Main basketball = new Main(); 
        basketball.gamePlayed(); 
        basketball.score(250);
    }
} 

