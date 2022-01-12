import java.util.*;
   public class sentinel1{
      public static void main(String[] args){
         Scanner console = new Scanner(System.in);
         int sum = 0;
       System.out.print("Enter a number (-3 to quit):");
         int number = console.nextInt();
         
         
         while (number !=-3){
            sum = sum + number;
            System.out.print("Enter a number (-3 to quit):");
             number = console.nextInt();
            
            
         }
            
         System.out.println("The total is " + sum);
       
       }
   }