import java.util.*;
public class array1ms{
   public static void main(String[] args){
      int[][] scores = new int[3][5];
      scores[0][0]= 30;
      scores[1][0]= 31;
      scores[2][0]= 32;
      scores[0][1]= 41;
      scores[0][2]= 42;
      scores[0][3]= 42;
      
      for(int i=0; i<scores.length; i++){
         for(int j=0; j<scores[i].length; j++){
     System.out.print(scores[i][j]+"\t");
         }
         System.out.println();
      }
      }
      
      }