/* 
--- Java Read Files
- Read a file
- We use the Scanner class to read the contents of the text file we created.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class ReadFile { 
    public static void main(String[] args) {
        try { 
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj); 
            while (myReader.hasNextLine()) { 
                String data = myReader.nextLine(); 
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) { 
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
