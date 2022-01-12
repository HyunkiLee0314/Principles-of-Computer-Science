import java.util.*;
   public class sentinel2{
      public static void main(String[] args){
         Scanner console = new Scanner(System.in);
         int sum = 0;
       System.out.print("Enter a number (stop to quit):");
         String word = console.nextLine();
         
         
         while (! word.equalsIgnoreCase("stop it")){
            sum = sum + Integer.parseInt(word);
            System.out.print("Enter a number (-3 to quit):");
             word = console.nextLine();
            
            
         }
            
         System.out.println("The total is " + sum);
       
       }
   }