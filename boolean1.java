public class boolean1{
   public static void main(String[] args){
      System.out.println(isVowel("A"));
      System.out.println(isVowel("a"));
      System.out.println(isVowel("m"));
      
   }
   
   
   public static boolean isVowel(String s){
      if(s.equalsIgnoreCase("a")){
         return true;
         
      }if(s.equalsIgnoreCase("e")){
         return true;
         
      }if(s.equalsIgnoreCase("i")){
         return true;
         
      }if(s.equalsIgnoreCase("o")){
         return true;
         
      }if(s.equalsIgnoreCase("u")){
         return true;
         
      }else{
         return false;

            }
    }
}