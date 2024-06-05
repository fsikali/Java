// Methods, Parameters and Arguments
// Parameters are specified after the method name inside the parentheses 
// ? Check how to use methods 

public class Main { 
    public static void main(String[] args) { 
        checkName("Flemming ", "Sikali"); 
        getNumber(10);
    } 

    static void checkName(String firstName, String lastName) { 
        System.out.println("Your name is: " + firstName + lastName);
    } 

    static void getNumber(int x) { 
        System.out.println("This is your number: " + x );
    }  
}

