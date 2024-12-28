public class reverse {
    public static void main(String[] args) {
        int n=1233;
        int sum=0;
        while(n!=0){
            int a =n%10;
            sum=sum*10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("Reverse: "+sum);
    }
}
