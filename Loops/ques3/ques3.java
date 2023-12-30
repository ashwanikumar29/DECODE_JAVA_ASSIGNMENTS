import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = scn.nextInt();

        System.out.print("Enter the number2: ");
        int n2 = scn.nextInt();

        int gcd = 1;

        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
