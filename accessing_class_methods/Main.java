// static method means that it can be accessed without creating an object of the class
// public method can be accessed by objects

public class Main { 
    // Static method 
    static void radioModel() { 
        System.out.println("Sony radio have good quality");
    }

    // Public method 
    public void tvModel() { 
        System.out.println("I bought samsung tv");
    } 

    // Main method 
    public static void main(String[] args) { 
        radioModel();

        Main samsung = new Main(); 
        samsung.tvModel();
    }
}

































