/*  

Loop through an array with  for each loop 
This is the syntax;

 for (type variable : arrayname) {
  ...
} 

*/ 


public class Main { 
    public static void main(String[] args) { 
        String[] cars = {"BMW", "Benz", "Ford", "Volkwagon", "Toyota"};
        for (String i : cars) { 
            System.out.println("This is: " + i);
        }
    }
}



