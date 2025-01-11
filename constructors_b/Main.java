// Constructor Parameters
// public keyword is an access modifier, it is used to set the access level
// for classes, attributes, methods and constructors


public class Main { 
    int passengerAge; 
    String passengerName;

    public Main(int age) { 
        passengerAge = age;
        passengerName = "Flemming";
    } 

    public static void main(String[] args) { 
        Main person = new Main(10); 
        System.out.println("The passenger is name is " + person.passengerName + " and he is " + person.passengerAge + " years old");
    }
}
