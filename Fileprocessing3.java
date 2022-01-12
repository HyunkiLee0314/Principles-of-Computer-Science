import java.io.*;
import java.util.*;

public class Fileprocessing3{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("numbers.txt"));
      int sum =0;
      int count = 0;
      
      while( input.hasNextInt()  ){
         sum = sum + input.nextInt();
         count++;
         
        
      
      }
         
      System.out.println("the sum of numbers is " + sum );
       System.out.printf("the average of numbers is %6.1f " , (1.0*sum/count) );

      input.close(); // important
      
   }
   
}