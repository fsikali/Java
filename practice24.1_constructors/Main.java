// Constructor Parameters
// public keyword is an access modifier, it is used to set the access level
// for classes, attributes, methods and constructors


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