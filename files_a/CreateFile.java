/*
--- Java Files
- Java has several methods for creating, reading, updating and deleting files.

--- Java File Handling
- The file class from the java.io package, allows us to work files.
- To use the File class, create an object of the class, and specify the filename or directory name:
- The File class has many useful methods for creating and getting information about files:

--- Java Create and Write To Files
-- Create a File
- To create a file in Java, you can use the createNewFile() method.
- This method returns a boolean value: true if the file was successfully created, and false if the file
  already exists.
- Note that the method is enclosec in a try...catch block.
- This is necessary because it throws an IOException if an error occurs(if the file cannot be created for some reason):
*/

// Example:

import java.io.File; 
import java.io.IOException;

public class CreateFile { 
    public static void main(String[] args) {
        try { 
          File myObj = new File("filename.txt");
          File myObj_a = new File("fle.txt");
          if (myObj.createNewFile() && myObj_a.createNewFile()) { 
            System.out.println("File created: " + myObj.getName());
            System.out.println("File created: " + myObj_a.getName());
          } else { 
            System.out.println("File already exists.");
          }
        } catch (IOException e) { 
          System.out.println("An error occured"); 
          e.printStackTrace();
        }
    }
}
