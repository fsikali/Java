/* Arrays are used to declare multiple values in a single variable  
   instead of declaring separate variables for each value 
*/ 

// Example - Creating and Accesing elements of a variable  

public class Main { 
    public static void main(String[] args) { 
        String[] cars = {"Benz", "Ford", "Range", "Volk", "Mazda"};  // Declaring and assigning an array 
        System.out.println("Index 0: " + cars[0]);  // Accessing elements of an array by referring to the index number  

        String x = cars[2];  
        System.out.println("Index 2: " + x);
        
        // Change an array element
        cars[2] = "BMW"; 
        System.out.println("Index 2 changed from Range to BMW: " + cars[2]);  
        System.out.println("Index 2: " + x); // Check on this --- value remains Range instead of changing to BMW
 
        // To find how many elements an array has use the length property 
        System.out.println("Total number of elements: " + cars.length); 
    }
}



