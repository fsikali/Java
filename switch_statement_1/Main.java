// If there is no case match the default keyword specifies some code of to run 

public class Main { 
    public static void main(String[] args) { 
        int score = 75; 
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
            System.out.println("Physics"); 
            default: 
            System.out.println("Biology");
        }
    }
}