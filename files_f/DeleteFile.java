/*
--- Delete a File
- To delete a file in Java, use the delete() method:
*/

import java.io.File; 

public class DeleteFile { 
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) { 
            System.out.println("Deleted the file: " + myObj.getName());
        } else { 
            System.out.println("Failed to delete the file.");
        }
    }
}
