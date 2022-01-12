import java.util.*;
import java.io.*;
   
   public class hours{
      public static void main(String[] args) throws FileNotFoundException{
      
      Scanner input = new Scanner(new File("hours.txt"));
      PrintStream out = new PrintStream(new File("copythat.txt"));
      while(input.hasNextLine()){
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         int id = lineScan.nextInt();
         String name = lineScan.next();
         double sum = 0.0;
         int count = 0;
         while(lineScan.hasNextDouble()){
            sum=sum+lineScan.nextDouble();
            count++;
            }
            
            System.out.println(name + "(ID#" + id +") worked" + sum + "hours("+(sum/count) + "hours/day)");         
            out.println(name + "(ID#" + id +") worked" + sum + "hours("+(sum/count) + "hours/day)");
      }
      }//main
   }//class