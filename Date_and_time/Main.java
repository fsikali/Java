// Display Current Date
// To display the current date, import the java.time.LocalDate class, and use its now() method

import java.time.LocalDate; // import the LocalDate class 

public class Main { 
    public static void main(String[] args) { 
        LocalDate myObj = LocalDate.now(); // Create a date object 
        System.out.println(myObj); // Display the current date 
    }
}


