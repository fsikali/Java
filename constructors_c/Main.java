public class Main { 
    int indexNumber; 
    String studentName;  

    public Main(int number, String name) { 
        indexNumber = number; 
        studentName = name; 
    } 

    public static void main(String[] args) {
        Main student = new Main(20, "John"); 
        System.out.println(student.indexNumber); 
        System.out.println(student.studentName);
    }

}