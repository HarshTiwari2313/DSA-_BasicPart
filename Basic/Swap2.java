import java.util.Scanner;
class Swap{
    public void swap(int a , int b){
        System.out.println("a before swapping: "+a+"  b before Swapping:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a After swapping: "+a+"  b After Swapping:"+b);


    }
}
public class Swap2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        Swap s = new Swap();
        s.swap(a, b);
    }
}
