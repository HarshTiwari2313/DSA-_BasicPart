import java.util.Scanner;

class Prime{
    static boolean isPrime(int num , int i){
        if(i==1){
            return true;
        }
        else if(num%i==0)  {

             return false;

        }
        else{
            return isPrime(num, --i);
        }
    }
}




public class PrimeNumberRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int i = num/2;
        boolean status = Prime.isPrime(num, i);
        if(status==true){
            System.out.println(num+" is prime");
        }
        else{
            System.out.println(num+" is not prime");
        }
    }
}
