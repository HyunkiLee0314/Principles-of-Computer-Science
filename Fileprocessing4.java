import java.io.*;
import java.util.*;

public class Fileprocessing4{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("wheather.txt"));
       double num = input.nextDouble();
       while(input.hasNextDouble()) {
         double next = input.nextDouble();
         System.out.println(num + " to " + next + ", change = " + (next - num));
            num=next;
      
       
      }
      
      
      
      
      
      
      
    }
}