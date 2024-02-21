package recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int ans = sOD(n);
        System.out.println("Your Answer is : "+ ans);
    }

    static int sOD(int n)
    {
        if(len(n))return n;
        else return sOD(n/10)+n%10;
    }

    static boolean len(int n)
    {
        return n / 10 == 0;
    }

}
