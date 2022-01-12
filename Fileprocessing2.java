import java.io.*;
import java.util.*;

public class Fileprocessing2{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("star.text"));
      int count =0;
      while( input.hasNext()  ){
         input.next();
         count++;
         
      
      }
      System.out.println("There are " + count + "words in the file");
      
      input.close(); // important
      
   }
   
}