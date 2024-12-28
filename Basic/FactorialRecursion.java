import java.util.Scanner;

class Factorial{
        static int factorial(int num){
            if(num==0 || num==1){
                return 1;
            }
            else{
                return num*factorial(num-1);
            }
        }
}





public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial is : "+Factorial.factorial(num));
    }
}
