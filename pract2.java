import java.util.*;

 // Compiler version JDK 11.0.2

 class PassFail
 {
   public static void main(String args[])
   { 
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter student mark");
    int m=inp.nextInt();
    if(m>=40)
      System.out.println("pass");
    else 
      System.out.println("Fail");
   }
 }
