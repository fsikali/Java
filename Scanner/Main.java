// Java User Input 
// The Scanner class is used to get user input, and it is found in the java.util package
// To use the Scanner class, create an object of class and use any of the available methods
// found in the Scanner class documentation 

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner car = new Scanner(System.in); // Scanner object

        System.out.println("Enter car name: ");
        String carname = car.nextLine();  // Reads the user input

        System.out.println("Enter milage: ");
        String carmilage = car.nextLine();

        System.out.println("The car name is: " + carname);
        System.out.println("The car milage is " + carmilage);

    }
}





