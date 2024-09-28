// Abstract
// Abstract class cannot be used to create objects
// To access an abstract class, it must be inherited from another class  
// Can only be used in an abstract class, and can only be used on methods 
// The method does not have a body 
// An abstract method belongs to an abstract class, and it does not have 
// a body. The body is provided by the subclass (inherited from)


// abstract class 
abstract class Main { 
    public String firstname = "John"; 
    public int age = 25; 
    public abstract void drive(); // abstract method
} 

// subclass (inherit from Main) 
class Driver extends Main { 
    public int passengersCarried = 100; 
    public void drive() {  // the body of the abstract class
        System.out.println("The driver operates a matatu business");
    }
}

 
class Second { 
    public static void main(String[] args) { 
        // create an object of the Driver class (which inherits attributes and methods from Main)
        Driver person = new Driver(); 
         
        System.out.println("Name: " + person.firstname);  
        System.out.println("Age: " + person.age);
        System.out.println("Passengers carried: " + person.passengersCarried); 
        person.drive();
    }
}












