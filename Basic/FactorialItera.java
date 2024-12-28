import java.util.Scanner;

class Factorial {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            System.out.println("Enter Positive Number");
            return -1910199292;
        } else {
            int fact = 1;

            while (num != 1) {
                fact = fact * num;
                num--;
            }
            return fact;
        }

    }
}

public class FactorialItera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : " + Factorial.factorial(num));
    }
}
