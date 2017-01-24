/*import java.util.Arrays;*/
public class Calculator {
  
  public static void main(String[] args) {
    double ans = 0;
    
    for (int i=0; i<args.length; i++){
      String Operator = args[0];
      double operand1 = Double.parseDouble(args[1]);
      double operand2 = Double.parseDouble(args[2]);    
      
      //adds two numbers
      if (Operator.equals ("add")){
        ans = operand1 + operand2;
        System.out.println("The result of your addition is: " + ans);  
        break;
      }
      
      //subtract two numbers
      else if (Operator.equals ("subtract")){
        ans = operand1 - operand2;
        System.out.println("The result of your subtarction is: " + ans);  
        break;
      }
      
      //multiply two numbers
      else if (Operator.equals ("multiply")){
        ans = operand1 * operand2;
        System.out.println("The result of your multiplication is: " + ans);  
        break;
      }
      
      //Divide two numbers
      else if (Operator.equals ("divide")){
        ans = operand1 / operand2;
        System.out.println("The result of your division is: " + ans);  
        break;
      }
      
      //displays an error message if incorrect input is entered
      else{
        System.out.println ("Error");
        break;
      }
    }
  }
}




