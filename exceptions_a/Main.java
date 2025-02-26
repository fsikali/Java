/*
--- Java Exceptions
- When executing Java code, different errors can occur: coding errors made by the programmer, errors
  due to wrong input, or other unforeseeable things
- When an error occurs, Java will normally stop and generate an error message.
- The technical term for this is: Java will throw an exception(throw an error).

--- Java try and catch
- The try statement allows you to define a block of code to be tested for errors while it is being
  executed.
- The catch statement allows you to define a block of code to be executed, if error occurs in the try block.
- The try and catch keywords come in pairs.
*/

// Example: This will generate an error, because myNumber[10] does not exist


public class Main { 
    public static void main(String[] args) {
        int [] myNumbers = {1, 2, 3}; 
        System.out.println(myNumbers[10]);
    }
}

