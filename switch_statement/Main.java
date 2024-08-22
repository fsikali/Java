// The switch expression is evaluated once 
// The value of the expression is compared with the value of each case
// If there is a match the assosited block of code is executed   
// When a case match is found Java breaks out of the switch block, with the help of break keyword


public class Main { 
    public static void main(String[] args) { 
        int score = 2; 
        switch(score) { 
            case 1: 
            System.out.println("John"); 
            break;
            case 2: 
            System.out.println("Peter"); 
            break; 
            case 3: 
            System.out.println("David"); 
            break;
        }
    }
}


