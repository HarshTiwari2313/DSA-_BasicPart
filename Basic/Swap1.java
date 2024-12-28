

import java.util.Scanner;
class Swap{
    static void swap(int a , int b){
        System.out.println("a before swapping: "+a+"  b before Swapping:"+b);
        int t =a;
        a=b;
        b=t;
        System.out.println("a After swapping: "+a+"  b After Swapping:"+b);

    }
}

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        Swap.swap(a, b);


    }
}
