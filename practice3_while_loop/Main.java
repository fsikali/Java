// While loop, loops through the block of code as long as the specified condition is true 
// Do not forget to increase the variable used in the condition otherwise the loop will never end 

public class Main { 
    public static void main(String[] args) { 
        
        int score = 10; 
        while (score <= 20) { 
            System.out.println(score); 
            score++;
        } 

        // method calling goes here  
        
        int finalScore = studentFinalScore(50, 60, 80); 
           
        System.out.println("-----------------------------------");
        System.out.println("This is my score: " + finalScore);   

    while( finalScore >= 90) {  
            System.out.println("This is my result: " + finalScore);  
            finalScore++;

             if (finalScore == 200) { 
             break;
         }
         
         }   

// method call goes here  

     mathScore();
  }   

/*
  Method calling for array 

      int[] finalPoints = gamePoints( {10, 20, 30, 40, 50}); {
      int yourPoints = finalPoints[2];
      System.out.println("This is your final score: " + yourPoints);

    }

*/

// Using while loop in methods with return type
    static int studentFinalScore(int math, int english, int kiswahili) { 
       return math + english + kiswahili;    

    }   

   /* 
      static int gamePoints(int[] points) { 
         return points;
    }
   
   */  

// Using method call in while loops 

static void mathScore() { 
    int myMathScore = 100; 

    while ( myMathScore >= 90) { 
        System.out.println("Excellent work: " + myMathScore);
        myMathScore++; 

        if (myMathScore == 100) { 
            break;
        }
    }
}

} 




