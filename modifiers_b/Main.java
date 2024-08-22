// Static keyword/method
// This is non-access modifier 
// Attributes and methods belong to the class rather than an object 
// It can be accessed without creating an object of the class unlike public 
 
public class Main { 
    // static method  
     static void checkMethod() { 
        System.out.println("This is my first name");
     }  
     // public method  
     public void checkSecondMethod() { 
        System.out.println("This is my second name");
     } 
     // main method 
     public static void main(String[] args) { 
        checkMethod(); 

        Main second = new Main(); 
        second.checkSecondMethod(); 
     }
}














