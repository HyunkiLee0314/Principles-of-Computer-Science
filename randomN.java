import java.util.*;
   public class randomN{
      public static void main(String[] args){
         Random rand = new Random();
         for(int i=1; i<=5; i++)
            System.out.println(rand.nextInt(3));
    
    }
}
