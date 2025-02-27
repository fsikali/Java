/*
- If the class implements the Runnable interface, the thread can be run by passing an instance of the
  class to a Thread object's constructor and the calling the thread's start() method:

- The major differences between "extending" and "implementing" Threads is, when a class extends the Thread class,
  you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another
  class as well, like: class MyClass extends OtherClass implements Runnable. 
*/

public class Main implements Runnable { 
    public static void main(String[] args) {
        Main obj = new Main(); 
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of thr thread");
    }

    public void run() { 
        System.out.println("This code is running in a thread");
    }
}
