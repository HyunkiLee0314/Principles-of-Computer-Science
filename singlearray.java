import java.util.*;
   public class singlearray{
      public static void main(String[] args){
         String[] names = {"john","Kim","Joe","Sam"};
         int[] scores = {80,90,85,75};
         int maxIndex=0;
         for(int i=0; i<scores.length; i++){
            if(scores[i] > scores[maxIndex])
               maxIndex = i;
          }
          
          System.out.println(names[maxIndex] + "got the higest score of" + scores[maxIndex]);
          
          
          }
   }