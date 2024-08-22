// Scanner class
// Create an object of the class and use any of the available methods
// found in the Scanner class documentation 

import java.util.Scanner; 

class Myclass { 
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username"); 

        String userName = myObj.nextLine(); 
        System.out.println("Username is: " + userName);
    }
}










 