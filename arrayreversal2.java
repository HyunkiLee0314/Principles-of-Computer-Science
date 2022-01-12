import java.util.*;
public class arrayreversal2{

   
      
      

  
   public static void main(String[] args){
   
      int[] x = {40,20,30,50,10};
   
   
      System.out.println(Arrays.toString(x));
      
      for (int i =0, j=x.length-1; i < x.length/2; i++,j--) {
         int temp= x[i];
         x[i] = x[j];
         x[j]=temp;
         
         }
         
         System.out.println(Arrays.toString(x));
     }
}//remember