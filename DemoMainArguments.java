import java.util.Scanner;
public class DemoMainArguments {
  
  public static void main(String[] args) {
    
    if (args[0].equals ("add")){
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);      
      System.out.println("The result of your addition is: " + one + two);     
    }
  }
  
}


