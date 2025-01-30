// You can modify attributes  
// If you don't want the ability to override existing values, declare the 
// attributes  
// final keyword is useful when you want a variable to always store the same
// value like P1(3.1459)
// final keyword is called a "modifier"

public class Main { 
     int count = 100; 

     public static void main(String[] args) { 
        Main qwertyKeyboard = new Main(); 
        qwertyKeyboard.count = 120;
        System.out.println("This number of key is: " + qwertyKeyboard.count); 
     }
} 

 

  