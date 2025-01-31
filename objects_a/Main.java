// Using Multiple Classes 
// You can also create an object of a class and access it 
// in another class  

// This is for : 
// Better organization of classes

class Team {  
    public int score; 
    public int anotherScore; 
}   

class Simba extends Team { 

    public Simba(int firstScore, int secondScore) {
         score = firstScore;
         anotherScore = secondScore;
    }
}

public class Main { 
    public static void main(String [] args) { 
        Simba teamSimba = new Simba(90, 100);   
        System.out.println("Team Simba scored: " + teamSimba.score + " and " + teamSimba.anotherScore);
    }
}

