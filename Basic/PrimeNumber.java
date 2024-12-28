import java.util.Scanner;

class Prime{
    static int primeno(int num){
        int factor=0;
        int temp= num;
        while(temp!=0){
            if(num%temp==0){
                factor = factor+1;
            }
            temp--;
        }
        return factor;
    }
}


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num =sc.nextInt();
        int factor = Prime.primeno(num);


        if (factor==2) {
            System.out.println(num+" is Prime number");
            
        } else if(factor>2) {
            System.out.println(num+" is Not a Prime Number");
        }
    }
}
