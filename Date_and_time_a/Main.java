// Display Current Time 
// To display the current time (hour, minute, second, nanoseconds), import the java.time.LocalTime class, and use its
// now() method 

import java.time.LocalTime; // import the LocalTime class 

public class Main { 
    public static void main(String[] args) { 
        LocalTime myObj = LocalTime.now(); 
        System.out.println(myObj);
    }
}