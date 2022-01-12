import java.io.*;
import java.util.*;

public class Fileprocessing1{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("star.text"));
      String word = "";   // for this case not need
      while( input.hasNextLine()  )
         System.out.println(input.nextLine());// input.next(). it comes each word each line
         
      
      
      
      input.close(); // important
      
   }
   
}