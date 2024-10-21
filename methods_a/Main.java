// Methods, Parameters and Arguments
// Parameters are specified after the method name inside the parentheses 
// ? Check how to use methods 

public class Main { 
    public static void main(String[] args) { 
        checkName("Flemming ", "Sikali"); 
        getNumber(10);  

        //int z = getNumberFive(); 
        System.out.println("This is your number: " + getNumberFive(5, 10)); 

        myName("Flemming ", 25);  
       // myName();


    } 

    static void checkName(String firstName, String lastName) { 
        System.out.println("Your name is: " + firstName + lastName);
    } 

    static void getNumber(int x) { 
        System.out.println("This is your number: " + x );
    }   

    static int getNumberFive(int x, int y) { 
        return x + y;
    } 

    static void myName(String fname, int score) {  
        String name = "Flemming Sikali";
        System.out.println("My name is: " + name);  

        System.out.println("Your name is " + fname + "and you scored " + score);


    }
}


