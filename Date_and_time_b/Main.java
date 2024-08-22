// Display Current Date and Time 
// To display the current date and time, import the java.time.LocalDateTime class 
// and use its now() method 

import java.time.LocalDateTime; // import the LocalDateTime class 

public class Main { 
    public static void main(String[] args) { 
        LocalDateTime myObj =  LocalDateTime.now(); 
        System.out.println(myObj);
    }
} 

