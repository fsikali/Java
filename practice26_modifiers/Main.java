// Example on final keyword
// final - Is a non-access modifier
// Attribute values and methods cannot be overridden/modif 

public class Main { 
    final int radius = 25; 
    final double PI = 3.14; 

    public static void main(String[] args) { 
        Main circle = new Main();
        //circle.radius = 10; this is an error
        System.out.println("This is the area: " + circle.radius);
    }
}























