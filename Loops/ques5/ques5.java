import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci terms to be printed: ");
        int n = scn.nextInt();

        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }


    }
}
