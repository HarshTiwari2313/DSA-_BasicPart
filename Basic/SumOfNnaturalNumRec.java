import java.util.Scanner;

class Sum{
    static int sum(int num){
        if(num==0){
            return 0;
        }
        else{
            return num+sum(num-1);
        }
        
    }
}





public class SumOfNnaturalNumRec {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Sum is : "+Sum.sum(a));
    }
}
