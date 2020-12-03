import java.util.Scanner;

class Main
{
  public static void main (String args[])
  {
    char operator;
    double number1 , number2 ,result;
    
    //declare scanner class
    Scanner input = new Scanner (System.in);
    
    //ask user to choose operator
    System.out.print("Choose an operator : + , - , *  or /  :  ");
   operator = input.next().charAt(0);
   
   //Ask user to input FIRST number
   System.out.println("Please Enter The First number : " );
   number1 = input.nextDouble();
   
   //Ask user input SECOND number
   System.out.println("Please Enter The Second Number : ");
   number2 = input.nextDouble();
   
   //taking switch case method
   switch(operator)
   {
     
     //performing addition
     case '+':
     result = number1 + number2;
     System.out.print(number1 + "+" + number2 + "=" +result);
     break;
     
     //performing substracion
     case '-':
       result = number1 - number2;
       System.out.print(number1+ "-" +number2 + "=" +result);
       break;
       
      //performing multiplication
      case '*':
        result = number1 * number2;
        System.out.print(number1+ "*" +number2 + "="+result);
        break;
        
        //performing decision
        case '/':
          result = number1 / number2;
          System.out.print(number1+ "/" +number2+ "=" +result);
        
        //default claculation
        default:
          System.out.println(" Invalid operator ! ");
          break;
   }
   //closing input scanner statement
   input.close();
  }
}