// Encapsulation - Is to make sure that sensitive data is hidden from users
// To achieve this you must: 
// declare class variables/attributes as private 
// provide public get and set methods to access and update the
// value of a private variable 
// private variable - can only be accessed within the same class ( an outside class has no acess to it)
// however it is possible to access them if we provide public get and set methods
// get method - returns the variable value
// set method - sets the value
// syntax - they start with either get or set, followes by the name of the variable, with the first letter
// in upper case 


public class Person { 
    private String firstname; // private = restricted access

    //Getter 
    public String getFirstname() { 
        return firstname;
    } 
    //Setter 
    public void setFirstname(String name) { 
        this.firstname = name;
    } 
} 










