import java.util.ArrayList;
import java.util.Scanner;

class Fibnocci{
    static ArrayList<Integer> fibnocci(int num){
        int a = 0;
        int b = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        
        for(int i = 1;i<=num-2;i++){
           
            int c= a+b;
            arrayList.add(c);
            a=b;
            b=c;

        }
        return arrayList;
    }
}




public class FibnocciNumIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        int num = sc.nextInt();
        ArrayList<Integer> arrayList= new ArrayList<>();
      arrayList.addAll(Fibnocci.fibnocci(num));
       System.out.println(arrayList);


    }
}
