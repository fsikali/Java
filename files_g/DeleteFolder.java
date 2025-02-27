/*
--- Delete a Folder
- You can also delte a folder. However, it must be empty
*/

import java.io.File;

public class DeleteFolder { 
    public static void main(String[] args) {
        File myObj = new File("/home/fsikali/Desktop/fle");
        if (myObj.delete()) { 
            System.out.println("Deleted the folder: " + myObj.getName());
        } else { 
            System.out.println("Failed to delete the folder.");
        }
    }
}

