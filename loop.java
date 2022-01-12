public class loop{
   public static void main(String[] args) {   

   for (int i = 1; i <3; i++){
      System.out.println(i);
      for (int j = 5; j<8; j++){
         System.out.println("\t" + j);
         for (int k = 1; k<3; k++){
            System.out.println("\t\t" + k);
         }
      }
   }
   }
}