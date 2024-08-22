//  Example user input (Scanner) 
import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Scanner student = new Scanner(System.in); 
        System.out.println("Enter the student name: ");

        String studentName = student.nextLine(); 
        System.out.println("Congratulions: " + studentName);
    }
} 







