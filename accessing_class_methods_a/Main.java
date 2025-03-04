public class Main {
    public void gamePlayed() {
        System.out.println("I played basketball"); 
    }  

    public void playerName(String name) { 
        System.out.println("The player name is: " + name);
    }

    public void score(int maxScore) { 
        System.out.println("Max score in the game is: " + maxScore); 

    } 

    public void anotherScore(int minScore) { 
        System.out.println("Min score in the game is: " + minScore);
    }
    
    static void leaderTeam(String name) { 
        System.out.println("The leading team is: " + name);
    }
    public static void main(String[] args) { 
        Main basketball = new Main(); 
        basketball.gamePlayed(); 
        basketball.playerName("Flemming");
        basketball.score(250);
        basketball.anotherScore(100);

        leaderTeam("Team Simba");
    }
} 

 
  