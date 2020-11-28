import java.util.*;

 // Compiler version JDK 11.0.2

 class SumOfeven
 {
   public static void main(String args[])
   {
    int sum=0 , i=1;
    do{
      if(i%2==0)
      {
      sum+=i;
      i++;
      }
      else{i++ ; continue;}
    }
    while(i<=10);
    System.out.println("Sum: "+sum);
   }
 }
