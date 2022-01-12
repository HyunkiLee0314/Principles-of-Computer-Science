public class whileloop{
   public static void main(String[] args){
      int i= 1 ;
      int j=1 ;
      while(i<6){
         
         while(j<=i){
           
            System.out.print("*"); 
             j++; 
         }
         System.out.println();
         i++;
         
         j=1;// why do i need this statement?
       }
    }
}