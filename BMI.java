import java.util.*;
public class BMI{
   public static void main(String[] args){
      System.out.println("This program displays your BMI.");
      
      Scanner console = new Scanner(System.in);
      double weight = 0;
      double height = 0;
      
      
      System.out.println("type your weight(pound).");
      weight = console.nextDouble();
      
      System.out.println("type your height(inches).");
      height = console.nextDouble();
      
      double BMI = (703*weight)/(height*height);
      
      System.out.println("your BMI is" +"\n"+ BMI);
      
      if (BMI >= 30.0){
         System.out.println("obese");
      } else if (BMI >=25.0){
         System.out.println("over");
      } else if (BMI >=18.5){
         System.out.println("normal");
      } else { 
         System.out.println("light");
      }
      
    }
 }
      