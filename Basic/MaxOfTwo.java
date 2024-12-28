import java.util.Scanner;
class Greater{
   static int greater(int a , int b){
      return (a>b)? a : b;

   }
}

public class MaxOfTwo {
   public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      System.out.print("Enter First Number : ");
       int a = sc.nextInt();
      System.out.print("Enter Second number : ");
      int b =sc.nextInt();
      System.out.println("Greater Number is : "+Greater.greater(a, b));
  

   }
}
