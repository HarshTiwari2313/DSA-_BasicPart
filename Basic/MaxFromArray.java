import java.util.Scanner;

class Max{
        static int maxEle(int []arr,int n){
          int max = arr[0];
          for( int i =1;i<n;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
           
          }
            return max;
    }
}


public class MaxFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter element of Array: ");
        for( int i =0;i<n;i++){
               int ele = sc.nextInt();
               arr[i]=ele;
        }
        System.out.print("Element of Array is:");

        for( int i =0;i<n;i++){
           System.out.print(arr[i]+",");
        }

        int max = Max.maxEle(arr,n);
        System.out.println("\nMax Element Of Array Is : "+max);
    }
}
