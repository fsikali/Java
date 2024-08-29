// Memory allocation in Java 
// String literals and integers

public class Main { 
    public static void main(String[] args){ 
        String fcar = "Benz"; 
        String fcar1 = fcar; 

        int age = 30; 
        int age2 = age;

        System.out.println("Car name: " + fcar);  
        System.out.println("Another car name: " + fcar1); 

        System.out.println("My age: " + age); 
        System.out.println("Another age: " + age2); 

        string_literal(); 
        another_string(); 
    } 

    static void string_literal() { 
        String a = "book"; 

        String b = a; 

        System.out.println("This is my: " + a); 
        System.out.println("This is my: " + b);
    } 

    static void another_string() {  

        // check for bugs in this code 

        String c = "laptop";  

        //System.out.println("My " + c);

        c = "headphones"; 

        System.out.println("My " + c); 
    }
}