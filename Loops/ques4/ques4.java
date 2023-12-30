import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();

        int leftidx = 0;
        int rightidx = str.length() - 1;
        boolean isPalindrome = true;
        while (leftidx < rightidx) {
            if (str.charAt(leftidx) != str.charAt(rightidx)) {
                isPalindrome = false;
                break;
            }
            leftidx++;
            rightidx--;
        }
        if (isPalindrome) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
