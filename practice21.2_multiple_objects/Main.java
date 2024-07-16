// If you create multiple objects of one class, you can change the
// attribute values in one object, without affecting the attribute 
// values in the other. 

public class Main { 
    int size = 42;

    public static void main(String[] args) { 
        Main safariBoot = new Main(); 
        Main toughies = new Main();
        toughies.size =  45; 

        System.out.println("Safari boot size: " + safariBoot.size); 
        System.out.println("Toughies size : " + toughies.size); 
    }
}