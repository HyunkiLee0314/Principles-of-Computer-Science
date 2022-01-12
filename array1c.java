import java.util.*;
public class array1c{
   public static void main(String[] args){
      int[][] scores = {{30,40,30},{20,40,0},{50,79,0}};
      
      for (int i=0; i<scores.length; i++){
      int sum=0;
         for(int j=0; j<scores[i].length; j++){
         sum += scores[j][i];
         
         
         }
         System.out.println("Average for text"+i+"is"+(sum/scores.length));
      }
      
      
      
      }
      
      }
//remember