package Inner_classes_a;
/*
--- Java Inner Classes
- In Java, it is possible to nest classes. 
- This helps to group classes that belong together, which makes your code more readable and maintainable
- To access the inner class, create an object of the outer class, and then create an object of the inner class

 */ 


class OuterClass { 
    int x = 10; 

    class InnerClass { 
        int y = 5;
    }
} 

public class Main { 
    public static void main(String[] args) { 
        OuterClass myOuter = new OuterClass(); 
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); 
        System.out.println(myInner.y + myOuter.x);
    }
}


