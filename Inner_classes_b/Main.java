package Inner_classes_b;

/*
 --- Private Inner Class 
 - Unlike "regular" class, an inner class can be private or protected. 
 - If you don't want outside ovjects to access the inner class, declare the class as private
 - If  you try to access a private class from an outside class, an error occurs
 */ 

 class OuterClass { 
    int x = 10; 

    private class InnerClass { 
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

