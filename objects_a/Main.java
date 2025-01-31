// Using Multiple Classes 
// You can also create an object of a class and access it 
// in another class  

// This is for : 
// Better organization of classes

class Team {  
    public int score; 
    public int anotherScore; 
    public String motto; 
}   

class Simba extends Team { 

    public int highScore;
    
        public Simba(int firstScore, int secondScore) {
             score = firstScore;
             anotherScore = secondScore; 
        } 
    
        public void teamMotto() {  
            String motto = "In God we trust";
            System.out.println("Team Simba motto: " + motto);
        } 

        public void teamResults() { 
            System.out.println("This was the first score: " + score); 
            System.out.println("This was the second score: " + anotherScore);
        }
    }
    
    public class Main { 
        public static void main(String [] args) { 
            Simba teamSimba = new Simba(90, 100);  
            teamSimba.highScore = 100;
            teamSimba.teamMotto();  
            teamSimba.teamResults();
             

            System.out.println("Team Simba scored: " + teamSimba.score + " and " + teamSimba.anotherScore);
            System.out.println("The highest score in the match was: " + teamSimba.highScore);
    }
}

