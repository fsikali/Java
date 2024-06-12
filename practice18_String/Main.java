// Memory allocation in Java 
// String literals and integers

public class Main { 
    public static void main(String[] args){ 
        String fcar = "Benz"; 
        String fcar1 = fcar; 

        int age = 30; 
        int age2 = age;

        System.out.println("Car name: " + fcar);  
        System.out.println("Another car name: " + fcar); 

        System.out.println("My age: " + age); 
        System.out.println("Another age: " + age2);
    }
}