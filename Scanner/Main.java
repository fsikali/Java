// Java User Input 
// The Scanner class is used to get user input, and it is found in the java.util package
// To use the Scanner class, create an object of class and use any of the available methods
// found in the Scanner class documentation 

import java.util.Scanner; // Import the Scanner class 

class Main { 
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username: "); 

        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName); // Output user input
    }
}


















