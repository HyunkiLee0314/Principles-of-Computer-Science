import java.util.*;
public class arrayreversal{

   
      
      

  
   public static void main(String[] args){
   
      int[] x = {40,20,30,50,10};
   
   
      System.out.println(Arrays.toString(x));
      
      for (int i =0; i < x.length/2; i++) {
         int temp= x[i];
         x[i] = x[x.length-1-i];
         x[x.length-1-i]=temp;
         
         }
         
         System.out.println(Arrays.toString(x));
     }
}