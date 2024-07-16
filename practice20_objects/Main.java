// In java an object is created from class 

// Create an object of Main, specify the class name, followed by the object name,
// and use the keyword new;  

//

public class Main { 
    int amount = 100000000;  
    String model = "Mercedes Benz";

    public static void main(String [] args) { 
        Main mercedesBenz = new Main();  
        Main mercedesBenz  = new Main();
        System.out.println("The amount is " + mercedesBenz.amount); 
        System.out.println("I have a " + mercedesBenz.model);
    }
} 


  