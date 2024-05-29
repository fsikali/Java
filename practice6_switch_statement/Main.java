// The switch expression is evaluated once 
// The value of the expression is compared with the value of each case
// If there is a match the assosited block of code is executed   
// When a case match is found Java breaks out of the switch block, with the help of break keyword


public class Main { 
    public static void main(String[] args) { 
        int score = 5;
        switch (score) { 
            case 1: 
            System.out.println("Mathematics");  
            break; 
            case 2: 
            System.out.println("English"); 
            break; 
            case 3: 
            System.out.println("Kiswahili"); 
            break; 
            case 4: 
            System.out.println("Chemistry"); 
            break; 
            case 5: 
            System.out.println("Physics"); 
            break;
            case 6: 
            System.out.println("Geography");
            break; 
            case 7: 
            System.out.println("History"); 
            break;  
        }
    }
}