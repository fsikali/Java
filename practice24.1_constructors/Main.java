// Constructor Parameters

public class Main { 
    int x; 

    public Main(int age) { 
        x = age;
    } 

    public static void main(String[] args) { 
        Main person = new Main(10); 
        System.out.println("I am " + person.x + " years old");
    }
}