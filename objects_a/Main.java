// Using Multiple Classes 
// You can also create an object of a class and access it 
// in another class  

// This is for : 
// Better organization of classes

public class Main { 
    int score = 10;
} 

class Team { 
    public static void main(String [] args) { 
        Main teamSimba = new Main(); 
        System.out.println("Team Simba scored: " + teamSimba.score);
    }
}