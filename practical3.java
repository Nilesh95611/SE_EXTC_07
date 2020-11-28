import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner inp=new Scanner(System. in);
    System.out.println("Enter three number");
    int num1=inp.nextInt();
    int num2=inp.nextInt();
    int num3=inp.nextInt();
    if(num1>num2 && num1>num3)
      System.out.println("largest no: "+num1);
    else if(num2>num1 && num2>num3)
      System.out.println("largest no: "+num2);
    else 
      System.out.println("largest no: "+num3);
      
   }
 }
