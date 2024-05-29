// Method is a block of code that runs when executed and is used to perform certain actions
// You can pass data known as parameters into a method 
// Why use methods - To reuse code 
//                 - To define the code once and use it many times 
// In Java a method must be declared within a class 

public class Main {  
    public static void main(String[] args) { 
      studentName(); 
      idNumber(); 
      //idNumber(); 
      carName();
    } 

    static void studentName() { 
        System.out.println("Flemming Sikali");  
        int score = 30; 
        System.out.println("This is the score: " + score);
    } 

// Using for loop in methods
    static void idNumber() { 
        int[] idNum = {10, 20, 30, 40, 50}; 
        for (int i = 0; i < idNum.length; i++){ 
            System.out.println("This is your ID Number: " + idNum[i]);
        }
    } 

// Using while loop in methods 
    static void carName() { 
        String[] cars = {"Benz", "BMW", "Ford", "Volks"}; 
        
        int i = 0;
        while( i < cars.length ) { 
            System.out.println("This is your car: " + cars[i]);
            i++;
        } 
    }

} 

// studentName is the name of the method 
// static means that the method belongs to Main class and not an object of the Main class
// void means that this method does not have a return value
// 
// 
//














